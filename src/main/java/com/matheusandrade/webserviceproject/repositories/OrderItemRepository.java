package com.matheusandrade.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusandrade.webserviceproject.entities.OrderItem;
import com.matheusandrade.webserviceproject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}