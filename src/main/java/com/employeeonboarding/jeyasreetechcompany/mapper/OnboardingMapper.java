package com.employeeonboarding.jeyasreetechcompany.mapper;

import com.employeeonboarding.jeyasreetechcompany.entity.OnboardingEntity;
import com.employeeonboarding.jeyasreetechcompany.model.OnboardingEmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OnboardingMapper {
    private final ModelMapper modelMapper;

    public OnboardingEntity dtoToEntity(OnboardingEmployeeDTO onboardingEmployeeDTO) {
        return modelMapper.map(onboardingEmployeeDTO, OnboardingEntity.class);


    }

    public OnboardingEmployeeDTO entityToDto(OnboardingEntity onboardingEntity) {
            return modelMapper.map(onboardingEntity, OnboardingEmployeeDTO.class);

    }
}
