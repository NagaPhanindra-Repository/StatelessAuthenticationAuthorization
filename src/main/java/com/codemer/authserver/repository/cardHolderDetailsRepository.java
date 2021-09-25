package com.codemer.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codemer.authserver.model.cardHolderDetails;

public interface cardHolderDetailsRepository extends JpaRepository<cardHolderDetails, Integer> {

	
	cardHolderDetails findByUserName(String userName);
	 

}
