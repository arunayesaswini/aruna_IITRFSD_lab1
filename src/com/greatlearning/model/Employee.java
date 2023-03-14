package com.greatlearning.model;

public class Employee
{
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	//base constructor
	public Employee()
	{

	}
	//parameterized constructor
	public Employee(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}

}
