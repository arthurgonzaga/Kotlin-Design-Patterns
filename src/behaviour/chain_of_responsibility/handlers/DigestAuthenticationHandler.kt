package behaviour.chain_of_responsibility.handlers

import behaviour.chain_of_responsibility.AuthenticationHandler
import behaviour.chain_of_responsibility.AuthenticationType

class DigestAuthenticationHandler(next: AuthenticationHandler?): AuthenticationHandler(next) {

    override fun handleRequest(type: AuthenticationType) {
        if(type == AuthenticationType.DIGEST) {
            println("Handling a Digest Authentication")
        } else {
            super.handleRequest(type)
        }
    }
}