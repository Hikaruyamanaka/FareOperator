package com.project.fare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project.fare.model.Fare;

@EnableJpaRepositories
@Repository
public interface FareRepository extends JpaRepository<Fare, Long> 
{		
	public Optional<Fare> findByFare(String fare);
		
	public List<Fare> findAllByOperatorIdContainingIgnoreCase (String operatorId);	
}
