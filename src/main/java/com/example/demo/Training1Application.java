package com.example.demo;

import com.example.demo.data.entity.Customers;
import com.example.demo.data.repository.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
public class Training1Application {

	public static void main(String[] args) {
		SpringApplication.run(Training1Application.class, args);
	}

}
