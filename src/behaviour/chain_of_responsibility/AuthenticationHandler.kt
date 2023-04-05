package behaviour.chain_of_responsibility

abstract class AuthenticationHandler(
    private val nextHandler: AuthenticationHandler?
) {

    open fun handleRequest(type: AuthenticationType) {
        nextHandler?.handleRequest(type)
    }

}