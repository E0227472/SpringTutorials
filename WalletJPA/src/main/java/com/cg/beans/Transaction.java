package com.cg.beans;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Transaction {
	// for transaction no need to reference back to the wallet as it is a uni directional mapping
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TransactionID")
	private int id;
	@Column(name = "Date")
	private LocalDateTime date;
	@Column(name = "Description")
	private String description;
	@Column(name = "amount")
	private double amount;
	@Column(name = "balance")
	private double balance;
	
	public Transaction(int id, LocalDateTime date, String description,
			double amount, double balance) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.balance = balance;
	}
	
	public Transaction() {
		
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", date=" + date + ", description="
				+ description + ", amount=" + amount + ", balance=" + balance
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Transaction other = (Transaction) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
