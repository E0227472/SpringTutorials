package com.cg.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	// one customer has one wallet
	// to differentiate 2 customer objects, use the hashcode and equals method 
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Customerid")
	private int id;
	@Column(name = "CustomerName")
	private String name; 
	@Column(name = "CustomerMobileNumber")
	private String mobile;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Wallet wallet;
	
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Customer() {
		
	}
	
	public Customer(String name, String mobile, Wallet wallet) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.wallet = wallet;
	}

	public Wallet getWallet() {
		return wallet;
	}
	
	public Wallet setWallet(Wallet w) {
		return this.wallet = w;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + "]";
	}

	public String getMobile() {
		return mobile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
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
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}


	
}
