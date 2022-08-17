package com.salary.api.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter(AccessLevel.PRIVATE) @Builder
public class SalaryRequest {
    private Double baseSalary;
    private List<Double> soldCarsPrices;
}
