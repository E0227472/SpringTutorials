package com.cg.services;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InsufficientBalanceException;
import com.cg.exceptions.InvalidInputException;

// Rename ServiceRepository to ServiceWallet
public interface Service {
	
	 public Customer createAccount(Customer c) 
			 throws InvalidInputException; 
	 public Customer getBalance(String mobile) 
			 throws AccountNotFoundException, InvalidInputException;
	 public Customer FundTransfer
	 (String fromMobile, String toMobile, double amount)
             throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;
	 
	 public Customer deposit (String mobile, double amount)
	 throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;

}
