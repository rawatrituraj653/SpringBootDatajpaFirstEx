package com.st.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Employee;
import com.st.repo.EmployeeRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	
@Autowired	
private EmployeeRepository repo;	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("class Name: "+repo.getClass().getName());
		repo.save(new Employee("Rituraj", 25000.00, 20));
		repo.save(new Employee("Pavan", 20000.00, 30));
		repo.save(new Employee("Parmanand", 22000.00, 10));
		Employee e=repo.save(new Employee(101,"Rajul", 28000.00, 30));
		System.out.println("record is added with id: "+e.getEid());
		repo.save(new Employee("Akanksha", 30000.00, 10));
	}

}
