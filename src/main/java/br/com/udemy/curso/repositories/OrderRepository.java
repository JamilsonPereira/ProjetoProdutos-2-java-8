package br.com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
