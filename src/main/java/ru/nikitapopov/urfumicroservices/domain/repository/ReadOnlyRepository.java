package ru.nikitapopov.urfumicroservices.domain.repository;

import ru.nikitapopov.urfumicroservices.domain.model.shared.AggregateRoot;
import ru.nikitapopov.urfumicroservices.domain.model.shared.Entity;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public interface ReadOnlyRepository<T extends Entity & AggregateRoot> {

    T first(Predicate<T> predicate);

    T firstOrDefault(Predicate<T> predicate);

    T single(Predicate<T> predicate);

    T singleOrDefault(Predicate<T> predicate);

    List<T> list(Predicate<T> predicate);

    Long count(Predicate<T> predicate);
}
