package com.salary.core.interfaces;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;

public interface SalaryService {
    SalaryResponse getSalary(SalaryRequest salaryRequest);
}
