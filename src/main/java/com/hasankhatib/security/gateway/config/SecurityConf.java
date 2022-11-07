package com.hasankhatib.security.gateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
@Configuration
@Slf4j
public class SecurityConf {

  @Bean
  SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
    return http.csrf().disable()
      .authorizeExchange()
      .anyExchange().hasAnyAuthority("API_USER")
      .and().httpBasic()
      .and().build();
  }

  @Bean
  public MapReactiveUserDetailsService userDetailsService() {
    UserDetails user =
      User.builder()
        .username("admin")
        .password(passwordEncoder().encode("pass"))
        .authorities("API_USER")
        .build();
    return new MapReactiveUserDetailsService(user);
  }

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
