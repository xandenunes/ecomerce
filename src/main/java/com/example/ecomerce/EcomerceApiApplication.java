package com.example.ecomerce;

import com.example.ecomerce.mapper.ProdutosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcomerceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomerceApiApplication.class, args);
	}

}
