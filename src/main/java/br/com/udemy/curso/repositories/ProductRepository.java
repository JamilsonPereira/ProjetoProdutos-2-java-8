package br.com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
