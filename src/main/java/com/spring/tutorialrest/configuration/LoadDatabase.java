package com.spring.tutorialrest.configuration;

import com.spring.tutorialrest.model.Employee;
import com.spring.tutorialrest.repository.EmployeeRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRespository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Bolson", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Bolson","thief")));
        };
    }
}
