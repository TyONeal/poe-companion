package com.poecompanion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/profile").authenticated()
                        .requestMatchers("/","/login").permitAll()
                        .requestMatchers("/js/**", "/css/**", "/img/**").permitAll())
                .formLogin(withDefaults());
        return httpSecurity.build();
    }
}
