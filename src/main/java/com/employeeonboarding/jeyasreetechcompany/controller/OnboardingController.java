package com.employeeonboarding.jeyasreetechcompany.controller;

import com.employeeonboarding.jeyasreetechcompany.api.EmployeeApi;
import com.employeeonboarding.jeyasreetechcompany.model.OnboardingEmployeeDTO;
import com.employeeonboarding.jeyasreetechcompany.service.OnboardingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OnboardingController implements EmployeeApi {
    private final OnboardingService onboardingService;

    @Override
    public ResponseEntity<String> addEmployee(OnboardingEmployeeDTO onboardingEmployeeDTO) {
        return onboardingService.addEmployee(onboardingEmployeeDTO);
    }

    @Override
    public ResponseEntity<List<OnboardingEmployeeDTO>> getAllEmployees() {
        return onboardingService.getAllEmployee();
    }
}
