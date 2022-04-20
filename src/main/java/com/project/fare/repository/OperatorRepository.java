package com.project.fare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.project.fare.model.Operator;

@EnableJpaRepositories
@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long> 
{		
	public Optional<Operator> findByOperator(String operator);
		
	public List<Operator> findAllByCodeContainingIgnoreCase (String code);	
}
