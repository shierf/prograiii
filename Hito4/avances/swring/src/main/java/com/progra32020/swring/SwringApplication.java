package com.progra32020.swring;

import com.progra32020.swring.Repo.ButtonRepository;
import com.progra32020.swring.Service.AlphabetService;
import com.progra32020.swring.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwringApplication  {
	@Autowired
private ButtonService ButtonService;
	@Autowired
	private AlphabetService AlphabetService;
	public static void main(String[] args) {

		//SpringApplication.run(SwringApplication.class, args);
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(SwringApplication.class);
		springApp.headless(false);
		springApp.run(args);
	}

	@PostConstruct
	public  void insertDataBase(){
      ButtonService.saveData();
      AlphabetService.saveData();
	}


}
