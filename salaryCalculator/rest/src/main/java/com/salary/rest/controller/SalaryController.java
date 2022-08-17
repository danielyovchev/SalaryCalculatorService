package com.salary.rest.controller;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;
import com.salary.core.interfaces.SalaryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }
    @PostMapping("/getSalary")
    SalaryResponse getSalary(@RequestBody SalaryRequest salaryRequest){
        return salaryService.getSalary(salaryRequest);
    }
}
