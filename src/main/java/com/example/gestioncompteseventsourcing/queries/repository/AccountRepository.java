package com.example.gestioncompteseventsourcing.queries.repository;


import com.example.gestioncompteseventsourcing.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BankAccount,String> {
}
