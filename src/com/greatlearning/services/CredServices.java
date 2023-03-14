package com.greatlearning.services;

import com.greatlearning.model.Employee;

public interface CredServices 
{
	String generateEmailId(Employee e1, String dept);
	String generatePassword();
	void showCredentials(Employee e1);

}
