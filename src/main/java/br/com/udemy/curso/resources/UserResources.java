package br.com.udemy.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.udemy.curso.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L, "Jamilson","jamilson.nunespe@gmail.com","971349736", "12345");
		return ResponseEntity.ok().body(u);
	}
}
