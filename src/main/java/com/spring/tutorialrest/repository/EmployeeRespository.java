package com.spring.tutorialrest.repository;


import com.spring.tutorialrest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
