package ru.nikitapopov.urfumicroservices.domain.model;

import lombok.Getter;
import lombok.Setter;
import ru.nikitapopov.urfumicroservices.domain.model.shared.AggregateRoot;
import ru.nikitapopov.urfumicroservices.domain.model.shared.Entity;

import java.util.List;

@Getter
@Setter
public class Customer extends Entity implements AggregateRoot {

    private String name;
    private String email;
    private Address address;
}
