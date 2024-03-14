package com.digitalWallet.digitalWallet.repositories;

import com.digitalWallet.digitalWallet.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
