package com.codemer.authserver.service;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codemer.authserver.model.Role;
import com.codemer.authserver.model.cardHolder;
import com.codemer.authserver.repository.cardHolderRepository;

@Service
public class customUserDetailsService implements UserDetailsService{

	 @Autowired
	 private cardHolderRepository cardHolderRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	cardHolder cardholder=	cardHolderRepo.findUserByUserName(username);
	
		System.out.println(cardholder.toString());
		System.out.println(cardholder.getRoles().toString());
		return new User(cardholder.getUserName(),cardholder.getPassword(),cardholder.getRoles());
	}
	
	

}
