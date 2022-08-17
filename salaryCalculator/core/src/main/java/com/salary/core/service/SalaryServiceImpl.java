package com.salary.core.service;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;
import com.salary.core.interfaces.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public SalaryResponse getSalary(SalaryRequest salaryRequest) {
        Double percentage = 0.02;
        final Integer soldCarsCount = salaryRequest.getSoldCarsPrices().size();
        if(soldCarsCount>4 && soldCarsCount< 10){
            percentage = 0.04;
        } else if (soldCarsCount>10) {
            percentage = 0.07;
        }
        final Double finalPercentage = percentage;
        Double bonus = salaryRequest.getSoldCarsPrices().stream()
                .reduce(0.0, (x,y) -> x+y*finalPercentage);
        final Double salary = bonus + salaryRequest.getBaseSalary();
        return SalaryResponse.builder().salary(salary).bonus(bonus).build();
    }
}
