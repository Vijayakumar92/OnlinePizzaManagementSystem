package com.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinepizza.entity.PizzaType;

@Repository
public interface PizzaTypeRepository extends JpaRepository<PizzaType, Integer>{

	String deleteById(PizzaType pizzaTypeId);

//	PizzaType findByPizzaTypeId(int id); // check once
}
