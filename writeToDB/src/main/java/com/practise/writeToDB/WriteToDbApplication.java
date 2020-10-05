package com.practise.writeToDB;

import com.practise.writeToDB.entity.Person;
import com.practise.writeToDB.jdbc.*;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class WriteToDbApplication implements CommandLineRunner {

	@Autowired
	PersonJDBCDao personDao;
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	
	public static void main(String[] args)  {
		
		
		SpringApplication.run(WriteToDbApplication.class, args);
		System.out.println("Hello Worl");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List <Person> per= personDao.findAll();
		logger.info("All users: {}", personDao.findAll());
		//System.out.println("Person values are "+personDao.findAll());
		
	}
}

