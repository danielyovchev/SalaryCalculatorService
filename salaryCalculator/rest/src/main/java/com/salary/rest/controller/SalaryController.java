package com.salary.rest.controller;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;
import com.salary.core.interfaces.SalaryOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
    private final SalaryOperation salaryOperation;

    public SalaryController(SalaryOperation salaryOperation) {
        this.salaryOperation = salaryOperation;
    }
    @PostMapping("/getSalary")
    SalaryResponse getSalary(@RequestBody SalaryRequest salaryRequest){
        return salaryOperation.getSalary(salaryRequest);
    }
}
