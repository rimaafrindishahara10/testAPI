package com.testAPI.repository;

import com.testAPI.entity.Batteries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryRepo extends JpaRepository<Batteries,Integer> {
}
