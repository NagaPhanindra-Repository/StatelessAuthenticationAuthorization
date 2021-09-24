package com.codemer.authserver;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mastercard.cardholder.model.cardHolder;
import com.mastercard.cardholder.model.cardHolderDetails;
import com.mastercard.cardholder.model.cardUserTransactions;
import com.mastercard.cardholder.repository.cardHolderDetailsRepository;
import com.mastercard.cardholder.repository.cardHolderRepository;
import com.mastercard.cardholder.repository.cardUserTransactionsRepository;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatelessAuthenticationAuthorizationApplication {
	
		 @Autowired
	    private cardHolderRepository repository;
	 @Autowired
	 private cardHolderDetailsRepository cardholderdetailsrepository;
	 @Autowired
	 private cardUserTransactionsRepository cardUserTransactionsrepository;

	    @PostConstruct
	    public void initUsers() {
	        List<cardHolder> cardholders = Stream.of(
	                new cardHolder(101, "user1", "password", "test1@mastercard.com"),
	                new cardHolder(102, "padma", "password", "e091308@mastercard.com"),
	                new cardHolder(103, "user2", "pwd2", "test2@mastercard.com"),
	                new cardHolder(104, "user3", "pwd3", "test3@mastercard.com")
	        ).collect(Collectors.toList());
	        repository.saveAll(cardholders);
	        
	        List<cardHolderDetails> cardholderDetails = Stream.of(
	                new cardHolderDetails(101, "naga","naga@CODEMER.com","Naga Phanindra","Ravuri","756.00 EUR","734.00EUR"),
	                new cardHolderDetails(102, "phani","naga@CODEMER.com","Naga Phanindra","Ravuri","756.00 EUR","734.00EUR"),
	                new cardHolderDetails(103, "user2", "naga@CODEMER.com","Naga Phanindra","Ravuri","756.00 EUR","734.00EUR"),
	                new cardHolderDetails(104, "user3", "naga@CODEMER.com","Naga Phanindra","Ravuri","756.00 EUR","734.00EUR")
	        ).collect(Collectors.toList());
	        cardholderdetailsrepository.saveAll(cardholderDetails);
	        
	        List<cardUserTransactions> cardUserTransactionsstream=Stream.of(new cardUserTransactions(1,8978787829l,"Purchase - Mari De ville ",new Date("01/07/2021 10:20 AM"),new Date("01/07/2021 10:15 AM"),"670.00 USD","660.00EUR"),
					new cardUserTransactions(2,8978787829l,"Purchase -Pharmacie ",new Date("01/04/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(3,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(4,8978787829l,"Purchase -Pharmacie ",new Date("01/03/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(5,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(6,8978787829l,"Purchase -Pharmacie ",new Date("01/02/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(7,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(8,8978787829l,"Purchase -Pharmacie ",new Date("01/01/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(9,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(10,8978787829l,"Purchase -Pharmacie ",new Date("12/25/2020 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(11,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(12,8978787829l,"Purchase -Pharmacie ",new Date("12/30/2020 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(13,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/01/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(14,8978787829l,"Purchase -Pharmacie ",new Date("01/07/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(15,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/05/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR"),
					new cardUserTransactions(16,8978787829l,"Purchase -Pharmacie ",new Date("01/05/2021 01:20 PM"),new Date("01/04/2021 01:15 PM"),"61.00 USD","46.90 EUR"),
					new cardUserTransactions(17,8978787829l,"Withdrawal-US Bank Drive-thru",new Date("01/02/2021 03:10 PM"),new Date("01/01/2021 03:15 PM"),"013.12 CHF","10.00 EUR")
					
	        		).collect(Collectors.toList());

	        cardUserTransactionsrepository.saveAll(cardUserTransactionsstream);
			 
		    
	    }

	    

	public static void main(String[] args) {
		SpringApplication.run(StatelessAuthenticationAuthorizationApplication.class, args);
	}

}
