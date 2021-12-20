package com.ncs.SpringSecurity.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	private final PasswordEncoder passwordEncoder;
	
	
	@Autowired
	public SecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		    .authorizeRequests()
		    .antMatchers("/","index")
		    .permitAll()
		    .anyRequest()
		    .authenticated()
		    .and()
		    .httpBasic();
	
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
	
	UserDetails shivam=	User.builder()
						.username("shivam123")
						.password(passwordEncoder.encode("password"))
						.roles()
						.build();
	UserDetails anil=	User.builder()
						.username("anil123")
						.password(passwordEncoder.encode("password123"))
						.roles("ADMIN")
						.build();
	
	return new InMemoryUserDetailsManager(shivam,anil);
		
		
	}
}
