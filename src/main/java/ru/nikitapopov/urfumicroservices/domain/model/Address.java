package ru.nikitapopov.urfumicroservices.domain.model;

public record Address(
        Integer number,
        String street,
        String city,
        String state,
        String country
) {}
