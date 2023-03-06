package com.example.patterns;

import com.example.patterns.Testing.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication implements CommandLineRunner {

	@Autowired
	private  Test test;



	public static void main(String[] args){

		SpringApplication.run(PatternsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		test.testing();
	}
}
