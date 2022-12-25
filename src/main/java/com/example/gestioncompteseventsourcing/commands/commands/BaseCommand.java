package com.example.gestioncompteseventsourcing.commands.commands;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseCommand<Ba> {
    @TargetAggregateIdentifier
    @Getter
    private Ba id;

    public BaseCommand(Ba id) {
        this.id = id;
    }

}
