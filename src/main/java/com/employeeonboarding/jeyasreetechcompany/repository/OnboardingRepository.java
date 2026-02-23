package com.employeeonboarding.jeyasreetechcompany.repository;

import com.employeeonboarding.jeyasreetechcompany.entity.OnboardingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnboardingRepository extends JpaRepository<OnboardingEntity,Integer> {
}
