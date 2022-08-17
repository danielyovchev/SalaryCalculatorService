package com.salary.core.service;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;
import com.salary.core.interfaces.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public SalaryResponse getSalary(SalaryRequest salaryRequest) {
        return null;
    }
}
