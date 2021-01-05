package com.devSuperior.DoniDonnie.s.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.DoniDonnie.s.dto.OrderDTO;
import com.devSuperior.DoniDonnie.s.dto.ProductDTO;
import com.devSuperior.DoniDonnie.s.entities.Order;
import com.devSuperior.DoniDonnie.s.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}