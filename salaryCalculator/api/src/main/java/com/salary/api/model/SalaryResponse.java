package com.salary.api.model;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE) @Builder @ToString @EqualsAndHashCode
public class SalaryResponse {
    private Double salary;
    private Double bonus;
}
