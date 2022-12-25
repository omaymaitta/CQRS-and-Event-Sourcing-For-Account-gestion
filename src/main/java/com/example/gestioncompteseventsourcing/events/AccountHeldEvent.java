package com.example.gestioncompteseventsourcing.events;


import com.example.gestioncompteseventsourcing.enums.AccountStatus;
import lombok.Getter;

public class AccountHeldEvent extends BaseEvent<String> {
    @Getter private final AccountStatus status;

    public AccountHeldEvent(String id, AccountStatus status) {
        super(id);
        this.status = status;
    }
}
