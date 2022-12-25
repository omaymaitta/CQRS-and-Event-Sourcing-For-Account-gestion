package com.example.gestioncompteseventsourcing.commands.services;



import com.example.gestioncompteseventsourcing.commands.dto.CreateAccountRequestDTO;
import com.example.gestioncompteseventsourcing.commands.dto.CreditAccountRequestDTO;
import com.example.gestioncompteseventsourcing.commands.dto.DebitAccountRequestDTO;


import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
