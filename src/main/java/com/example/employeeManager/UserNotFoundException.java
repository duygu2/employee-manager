package com.example.employeeManager;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {

    super(message);

    }
}
