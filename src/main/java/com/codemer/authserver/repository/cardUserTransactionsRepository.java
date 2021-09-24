package com.codemer.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mastercard.cardholder.model.cardHolder;
import com.mastercard.cardholder.model.cardUserTransactions;

public interface cardUserTransactionsRepository extends JpaRepository<cardUserTransactions, Integer>{

}
