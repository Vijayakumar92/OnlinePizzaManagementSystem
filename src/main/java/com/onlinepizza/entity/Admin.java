package com.onlinepizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;

}
