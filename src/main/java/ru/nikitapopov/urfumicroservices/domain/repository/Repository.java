package ru.nikitapopov.urfumicroservices.domain.repository;

import ru.nikitapopov.urfumicroservices.domain.model.shared.AggregateRoot;
import ru.nikitapopov.urfumicroservices.domain.model.shared.Entity;

public interface Repository<T extends Entity & AggregateRoot> extends ReadOnlyRepository<T> {

    T find(Long id);

    T save(T root);

    boolean remove(T root);

    boolean saveChanges();
}
