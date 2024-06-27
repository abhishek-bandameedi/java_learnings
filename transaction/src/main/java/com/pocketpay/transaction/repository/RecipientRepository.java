package com.pocketpay.transaction.repository;

import com.pocketpay.transaction.entity.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient,Long> {
}
