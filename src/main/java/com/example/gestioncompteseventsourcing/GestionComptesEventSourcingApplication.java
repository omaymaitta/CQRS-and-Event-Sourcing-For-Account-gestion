package com.example.gestioncompteseventsourcing;

import com.example.gestioncompteseventsourcing.commands.aggregates.AccountAggregate;
import org.axonframework.common.jpa.EntityManagerProvider;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.annotation.ParameterResolverFactory;
import org.axonframework.modelling.command.GenericJpaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionComptesEventSourcingApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionComptesEventSourcingApplication.class, args);
    }
    public GenericJpaRepository<AccountAggregate> accountAggregateRepository(EntityManagerProvider e, ParameterResolverFactory p, EventBus eb){
        return GenericJpaRepository.builder(AccountAggregate.class)
                .entityManagerProvider(e)
                .parameterResolverFactory(p)
                .eventBus(eb)
                .build();
    }

    public EventSourcingRepository<AccountAggregate> eventSourcingRepository(EventStore eventStore, ParameterResolverFactory prf){
        return EventSourcingRepository.builder(AccountAggregate.class)
                .eventStore(eventStore)
                .parameterResolverFactory(prf)
                .build();
    }
}
