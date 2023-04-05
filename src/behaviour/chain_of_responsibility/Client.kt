package behaviour.chain_of_responsibility

import behaviour.chain_of_responsibility.handlers.BasicAuthenticationHandler
import behaviour.chain_of_responsibility.handlers.ClientCertificateAuthenticationHandler
import behaviour.chain_of_responsibility.handlers.DigestAuthenticationHandler


fun main() {

    val authHandler = ClientCertificateAuthenticationHandler(
        next = BasicAuthenticationHandler(
            next = DigestAuthenticationHandler(
                next = null
            )
        )
    )

    authHandler.handleRequest(AuthenticationType.DIGEST)
    authHandler.handleRequest(AuthenticationType.BASIC)
    authHandler.handleRequest(AuthenticationType.CLIENT_CERTIFICATE)
}