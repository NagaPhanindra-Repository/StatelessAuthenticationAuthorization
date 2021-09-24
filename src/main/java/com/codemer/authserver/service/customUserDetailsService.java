package com.codemer.authserver.service;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codemer.authserver.model.cardHolder;
import com.codemer.authserver.repository.cardHolderRepository;

@Service
public class customUserDetailsService implements UserDetailsService{

	 @Autowired
	 private cardHolderRepository cardHolderRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	cardHolder cardholder=	cardHolderRepo.findUserByUserName(username);
		
		return new User(cardholder.getUserName(),cardholder.getPassword(),new ArrayList());
	}

}
