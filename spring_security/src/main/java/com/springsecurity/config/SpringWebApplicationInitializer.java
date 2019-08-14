package com.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// initializer class for web application security 
@Configuration
@EnableWebSecurity
public class SpringWebApplicationInitializer extends WebSecurityConfigurerAdapter {
	// autowired means no need write UserDetailsService uds = new UserDetailsService();
	@Autowired
	private UserDetailsService userDetailsService;

	// getting the username and password and then comparing with database and see if it is correct 
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		// setting the service as userdetailsservice 
		provider.setUserDetailsService(userDetailsService);
		// getting the passwords from database. passwords crypted / hashed using Bcrypt library 
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		List<UserDetails> users = new ArrayList<>();
//		
//		users.add(User.withDefaultPasswordEncoder().username("john").password("1234").roles("User").build());
//		
//		return new InMemoryUserDetailsManager(users);
//	}
	
}
