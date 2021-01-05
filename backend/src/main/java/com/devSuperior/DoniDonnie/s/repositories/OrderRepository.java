package com.devSuperior.DoniDonnie.s.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.DoniDonnie.s.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
