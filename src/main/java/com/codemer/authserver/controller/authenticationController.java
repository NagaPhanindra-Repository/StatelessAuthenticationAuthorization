package com.codemer.authserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemer.authserver.model.cardHolder;
import com.codemer.authserver.model.cardHolderDetails;
import com.codemer.authserver.model.requestModel;
import com.codemer.authserver.repository.cardHolderDetailsRepository;
import com.codemer.authserver.util.JWTUtil;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class authenticationController {
	
	@Autowired
	private JWTUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private cardHolderDetailsRepository cardholderdetailsrepository;
	
	

	@PostMapping("/authenticate")
	public String generateJWTToken(@RequestBody requestModel requestmodel) throws Exception {
		System.out.println("#########AUth Begin####");
		try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(requestmodel.getUserName(), requestmodel.getPassword()));
		}
		catch(Exception e)
		{
			throw new Exception("Invalid User name or password");
		}
		System.out.println("auth Done ##########");
		String tt=jwtUtil.generateToken(requestmodel.getUserName());
		System.out.println("auth Done ########## token : "+tt);
		return jwtUtil.generateToken(requestmodel.getUserName());
	}
}
