package behaviour.chain_of_responsibility.handlers

import behaviour.chain_of_responsibility.AuthenticationHandler
import behaviour.chain_of_responsibility.AuthenticationType

class BasicAuthenticationHandler(next: AuthenticationHandler?): AuthenticationHandler(next) {

    override fun handleRequest(type: AuthenticationType) {
        if(type == AuthenticationType.BASIC) {
            println("Handling a Basic Authentication")
        } else {
            super.handleRequest(type)
        }
    }
}