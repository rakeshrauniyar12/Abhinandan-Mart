package com.abhi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	@NotNull(message = "Name should not be null")
	private String adminName;
	
	@NotNull(message = "email should be in proper format")
	@Email
	private String adminEmail;
	
	@NotNull(message = "password should not be null")
	//@Size(min = 8,max = 20,message = "Password should be between 8 to 20")
	private String adminPassword;
	
	@NotNull(message = "Mobile number should be of 10 digits")
	@Size(min = 10,max = 10,message = "Mobile number should be of 10 digits")
	private String mobileNo;
	

}
