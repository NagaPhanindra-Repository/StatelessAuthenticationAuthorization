package com.codemer.authserver.controller;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemer.authserver.model.cardUserTransactions;
import com.codemer.authserver.repository.cardHolderDetailsRepository;
import com.codemer.authserver.repository.cardUserTransactionsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/authenticate/")
public class cardUserTransactionsController {
	
	@Autowired
	private cardUserTransactionsRepository cardholderdetailsrepository;
	
	
	 @GetMapping("/LastTenTransactions")		   
	    public List<cardUserTransactions> getLastTenTransactions() {
	    	
	    	
	    	List<cardUserTransactions> Slist2=cardholderdetailsrepository.findAll().stream().sorted(Comparator.comparing(cardUserTransactions::getTransactionTime).reversed()).collect(Collectors.toList());
			List<cardUserTransactions> myLast50Transactions = Slist2.stream().limit(10).collect(Collectors.toList());
			//List<cardUserTransactions> myLast50Transactions = Slist2.subList(Slist2.size()-Math.min(Slist2.size(),50), Slist2.size());
			//return Slist2;
			
			return myLast50Transactions;
	    }
	    
	    @GetMapping("/transactions")		   
	    public List<cardUserTransactions> getAllTransactions() {
	    	
	    	
	    	return cardholderdetailsrepository.findAll();
	    }
	    
	    @GetMapping("/CurrentTransactions")		   
	    public List<cardUserTransactions> getCurrentTransactions() {
	    	
	    	
	    	 LocalDate currentDate = LocalDate.now();
			    int month=currentDate.getMonthValue();
			List<cardUserTransactions> CurrentTransactionWithoutSort =cardholderdetailsrepository.findAll().stream()
	        .filter(cardUserTransactions -> cardUserTransactions.getTransactionTime().getMonth()==month-1).collect(Collectors.toList());
			
			
			List<cardUserTransactions> myCurrentTransactions=CurrentTransactionWithoutSort.stream().sorted(Comparator.comparing(cardUserTransactions::getTransactionTime).reversed()).collect(Collectors.toList());
			
			
			return myCurrentTransactions;
	    }


	
		
	        
	
	
	
	
}
