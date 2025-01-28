package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByCustomerId(Long customerId);
}