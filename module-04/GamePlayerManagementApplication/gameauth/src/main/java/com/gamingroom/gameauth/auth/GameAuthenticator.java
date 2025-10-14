package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public class GameAuthenticator implements Authenticator<BasicCredentials, GameUser> 
{
    // Include all test usernames with their roles 
    private static final Map<String, Set<String>> VALID_USERS = ImmutableMap.of(
        "guest",  ImmutableSet.of(),               // no roles
        "user",   ImmutableSet.of("USER"),         // standard user
        "player", ImmutableSet.of("USER"),         // standard user 
        "admin",  ImmutableSet.of("ADMIN", "USER") // admin can also act as user
    );

    @Override
    public Optional<GameUser> authenticate(BasicCredentials credentials) throws AuthenticationException 
    {
        if (VALID_USERS.containsKey(credentials.getUsername()) && "password".equals(credentials.getPassword())) 
        {
            // FIXME: Finish the authorize method based on BasicAuth Security Example for new GameUser
            // Create a GameUser populated with username and roles and return it.
            // This lets the Dropwizard know that the authentication succeeded.
            return Optional.of(new GameUser(
                credentials.getUsername(),
                VALID_USERS.get(credentials.getUsername())
            ));
        }
       
        return Optional.empty();
    }
}
