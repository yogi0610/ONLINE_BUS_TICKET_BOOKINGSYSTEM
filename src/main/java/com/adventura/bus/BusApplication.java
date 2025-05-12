package com.adventura.bus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages = "com.adventura.bus.model")
@EnableJpaRepositories(basePackages = "com.adventura.bus.repository")
@SpringBootApplication
public class BusApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(BusApplication.class, args);
	}
}
