package com.employeeonboarding.jeyasreetechcompany.service;

import com.employeeonboarding.jeyasreetechcompany.entity.OnboardingEntity;
import com.employeeonboarding.jeyasreetechcompany.mapper.OnboardingMapper;
import com.employeeonboarding.jeyasreetechcompany.model.OnboardingEmployeeDTO;
import com.employeeonboarding.jeyasreetechcompany.repository.OnboardingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OnboardingService {
    private final OnboardingRepository onboardingRepository;
    private final OnboardingMapper onboardingMapper;

    public ResponseEntity<String> addEmployee(OnboardingEmployeeDTO onboardingEmployeeDTO) {
        OnboardingEntity onboardingEntity=onboardingMapper.dtoToEntity(onboardingEmployeeDTO);
        onboardingRepository.save(onboardingEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");
    }

    public ResponseEntity<List<OnboardingEmployeeDTO>> getAllEmployee() {
       List<OnboardingEntity> onboardingEntity= onboardingRepository.findAll();
       List<OnboardingEmployeeDTO> employeeDTOList = onboardingEntity.stream()
               .map(onboardingMapper::entityToDto)
               .toList();
       return ResponseEntity.ok(employeeDTOList);
    }
}
