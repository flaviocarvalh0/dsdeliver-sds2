package com.devSuperior.DoniDonnie.s.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.DoniDonnie.s.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findAllByOrderByNameAsc();
}
