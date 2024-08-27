package com.testAPI.repository;

import com.testAPI.entity.Batteries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface BatteryRepo extends JpaRepository<Batteries,Integer> {


    List<Batteries> findByPostCodeBetween(String start,String end);
}
