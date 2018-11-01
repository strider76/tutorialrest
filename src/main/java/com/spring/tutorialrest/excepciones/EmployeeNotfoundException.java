package com.spring.tutorialrest.excepciones;

public class EmployeeNotfoundException extends RuntimeException {
    public EmployeeNotfoundException(Long id) {
        super("Could not find employee " + id);
    }
}
