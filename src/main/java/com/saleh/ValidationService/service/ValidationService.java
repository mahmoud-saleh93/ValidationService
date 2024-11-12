package com.saleh.ValidationService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ValidationService {
    public boolean validateEmail(String email) {
        return email.contains("@") && email.endsWith(".com");
    }

    public boolean validateDepartment( String department) {
        return department.matches("^(HR|Engineering|Sales)$");
    }
}
