package com.example.gestioncompteseventsourcing.mappers;


import com.example.gestioncompteseventsourcing.queries.dto.AccountOperationResponseDTO;
import com.example.gestioncompteseventsourcing.queries.dto.BankAccountResponseDTO;
import com.example.gestioncompteseventsourcing.queries.entities.AccountOperation;
import com.example.gestioncompteseventsourcing.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
