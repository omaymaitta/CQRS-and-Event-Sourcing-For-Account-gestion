package com.example.gestioncompteseventsourcing.commands.excepetions;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
