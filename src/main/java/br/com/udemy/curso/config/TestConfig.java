package br.com.udemy.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.udemy.curso.entities.User;
import br.com.udemy.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Teste", "teste@teste.com", "999999999", "12345");
		User u2 = new User(null, "Teste2", "teste2@teste2.com", "999999999", "12345");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}