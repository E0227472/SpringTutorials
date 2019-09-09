package com.cg.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Wallet {
	// one wallet has many transactions
	// implement hashcode and equals method to differentiate the objects by id and transactions
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "WalletId")
	private int id;
	@Column(name = "WalletBalance")
	private double balance;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Transaction> transactions;
	
	public Wallet(double balance, List<Transaction> transactions) {
		super();
		this.balance = balance;
		this.transactions = transactions;
	}
	
	public Wallet() {
		
	}
	
	public Wallet(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wallet other = (Wallet) obj;
		if (id != other.id)
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		return true;
	}

}
