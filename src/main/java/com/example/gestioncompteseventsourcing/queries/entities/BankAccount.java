package com.example.gestioncompteseventsourcing.queries.entities;


import com.example.gestioncompteseventsourcing.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
}
