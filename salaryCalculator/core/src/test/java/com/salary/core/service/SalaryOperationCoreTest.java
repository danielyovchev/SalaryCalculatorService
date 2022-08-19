package com.salary.core.service;

import com.salary.api.model.SalaryRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class SalaryOperationCoreTest {
    SalaryOperationCore salaryOperationCore;
    @BeforeEach
    void setUp() {
        salaryOperationCore = new SalaryOperationCore();
    }

    @Test
    void getSalary() {
        List<Double> carPrices = new ArrayList<>();
        carPrices.add(4500.0);
        carPrices.add(2532.0);
        carPrices.add(8050.0);
        var salaryRequest = SalaryRequest.builder().baseSalary(2000.0)
                .soldCarsPrices(carPrices).build();

        Assertions.assertEquals(2301.64, salaryOperationCore.getSalary(salaryRequest).getSalary());
    }
}