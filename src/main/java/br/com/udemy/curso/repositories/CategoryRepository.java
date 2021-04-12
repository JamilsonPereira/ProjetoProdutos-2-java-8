package br.com.udemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.udemy.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
