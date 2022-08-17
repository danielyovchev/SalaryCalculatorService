package com.salary.api.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE) @Builder
public class SalaryResponse {
    private Double salary;
    private Double bonus;
}
