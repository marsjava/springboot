package com.spboot;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.net.SyslogAppender;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hi, This is my first spboot console app.");
		/*Employee emp = new Employee();
		emp.setEmpid(1002);
		emp.setName("Antony");
		emp.setDesignation("Managing Director");
		emp.setDoj(new Date());
		employeeRepository.save(emp);
		System.out.println("Successfully insert a record.");*/
		List<Employee> eList = employeeRepository.findAll();
		eList.forEach(System.out::println);
	}
}
