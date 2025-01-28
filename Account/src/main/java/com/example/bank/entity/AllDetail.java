package com.example.bank.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllDetail {
    private Account accountDetail;
    private Customer customerDetail;
	public Account getAccountDetail() {
		return accountDetail;
	}
	public void setAccountDetail(Account accountDetail) {
		this.accountDetail = accountDetail;
	}
	public Customer getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(Customer customerDetail) {
		this.customerDetail = customerDetail;
	}

}