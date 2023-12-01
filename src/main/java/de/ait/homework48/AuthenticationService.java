package de.ait.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.AuthenticationException;

public class AuthenticationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationService.class);

    private static final String USERNAME = "user213";
    private static final String PASSWORD = "password543";
   public boolean autenticate(String username, String password){
        try {
        if (username.equals(USERNAME) && password.equals(PASSWORD)){
            LOGGER.info("user {} was authenticated",username);
        } else {
            throw new AuthenticationException("wrong username/password.txt username: " + username);
        }
        }
        catch (AuthenticationException exception){
            LOGGER.error("wrong username/password.txt username: {}", username );
        }
        return false;
   }

}
