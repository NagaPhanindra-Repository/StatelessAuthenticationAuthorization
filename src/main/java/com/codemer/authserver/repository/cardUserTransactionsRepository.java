package com.codemer.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemer.authserver.model.cardHolder;
import com.codemer.authserver.model.cardUserTransactions;

public interface cardUserTransactionsRepository extends JpaRepository<cardUserTransactions, Integer>{

}
