package com.salary.api.feign;

import com.salary.api.model.SalaryRequest;
import com.salary.api.model.SalaryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "SalaryFeignClient", url = "http://localhost:8085")
public interface SalaryFeign {
    @PostMapping("/getSalary")
    SalaryResponse getSalary(@RequestBody SalaryRequest salaryRequest);
}
