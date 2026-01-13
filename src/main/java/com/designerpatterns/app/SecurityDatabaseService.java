package com.designerpatterns.app;

import org.jspecify.annotations.NullMarked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityDatabaseService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @NullMarked
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByName(username);

        if(userEntity == null){
            throw new UsernameNotFoundException(username);
        }

        return User.builder()
                .username(userEntity.getUsername())
                .password("{noop}" + userEntity.getPasswd())
                .disabled(!userEntity.getActive())
                .roles(userEntity.getRole())
                .build();
    }
}