package ru.nikitapopov.urfumicroservices.domain.model;

import lombok.Getter;
import lombok.Setter;
import ru.nikitapopov.urfumicroservices.domain.model.shared.AggregateRoot;
import ru.nikitapopov.urfumicroservices.domain.model.shared.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order extends Entity implements AggregateRoot {

    private LocalDateTime createdAt;
    private Long customerId;
    private Address address;
    private List<OrderItem> orderItems = new ArrayList<>();

    @Getter
    @Setter
    public static class OrderItem extends Entity{

        private Long id;
        private String name;
    }
}
