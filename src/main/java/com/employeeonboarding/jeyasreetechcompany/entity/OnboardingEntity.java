package com.employeeonboarding.jeyasreetechcompany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="onboarding_employee")
public class OnboardingEntity {
    @Id
    private int employeeId;
    private String employeeName;
    private String email;
    private String role;
    private int salary;
    private LocalDateTime joiningDate;

}
