package com.codemer.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastercard.cardholder.model.cardHolder;

@Repository
public interface cardHolderRepository extends JpaRepository<cardHolder, Integer>  {

	cardHolder findUserByUserName(String username);
	
	

}
