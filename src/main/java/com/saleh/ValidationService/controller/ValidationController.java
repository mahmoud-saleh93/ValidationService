package com.saleh.ValidationService.controller;

import com.saleh.ValidationService.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValidationController {

    @Autowired
    private ValidationService validationService;

    @GetMapping("/validate/email/{email}")
    public boolean validateEmail(@PathVariable String email) {
        return validationService.validateEmail(email);
    }

    @GetMapping("/validate/department/{department}")
    public boolean validateDepartment(@PathVariable String department) {
        return validationService.validateDepartment(department);
    }
}
