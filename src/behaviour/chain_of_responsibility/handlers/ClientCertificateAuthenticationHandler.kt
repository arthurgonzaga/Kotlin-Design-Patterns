package behaviour.chain_of_responsibility.handlers

import behaviour.chain_of_responsibility.AuthenticationHandler
import behaviour.chain_of_responsibility.AuthenticationType

class ClientCertificateAuthenticationHandler(next: AuthenticationHandler?): AuthenticationHandler(next) {

    override fun handleRequest(type: AuthenticationType) {
        if(type == AuthenticationType.CLIENT_CERTIFICATE) {
            println("Handling a Client Certificate Authentication")
        } else {
            super.handleRequest(type)
        }
    }
}