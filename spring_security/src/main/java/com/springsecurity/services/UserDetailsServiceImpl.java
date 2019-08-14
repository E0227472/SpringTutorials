package com.springsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.models.User;
import com.springsecurity.repository.UserRepository;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	// method returns user object details 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// getting the user object, with username and password from database by username entry. 
		User user = userRepository.findByUsername(username);
		
		if(user == null)
			throw new UsernameNotFoundException("404 error");
		
		return new UserDetailsImpl(user);
	}

}
