package com.example.bank.service;

import com.example.bank.entity.Account;

public interface AccountService {
    Account addMoneyToAccount(Long customerId, Double amount);

    Account withdrawMoneyFromAccount(Long customerId, Double amount);

    Account getAccountDetails(Long customerId);

    Account deleteAccount(Long customerId);
}