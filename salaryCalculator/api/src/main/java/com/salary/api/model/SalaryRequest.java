package com.salary.api.model;

import lombok.*;

import java.util.List;
@Getter @Setter(AccessLevel.PRIVATE) @Builder @EqualsAndHashCode
public class SalaryRequest {
    private Double baseSalary;
    private List<Double> soldCarsPrices;
}
