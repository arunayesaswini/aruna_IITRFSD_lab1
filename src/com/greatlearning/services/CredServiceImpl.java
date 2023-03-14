package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.model.Employee;


public class CredServiceImpl implements CredServices
{
	@Override
	public String generateEmailId(Employee e1, String dept) {

		String emailid="";
		emailid=e1.getFirstname().toLowerCase()+e1.getLastname().toLowerCase()+"@"+dept+".infosys.com";
		return emailid;
	}

	@Override
	public String generatePassword() {
		String pswd="";
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		//combining all the strings into one

		String cmbltrs= caps+lower+nums+splchars;
		Random random=new Random();

		for(int i=0;i<8;i++)
		{
			pswd = pswd+String.valueOf(cmbltrs.charAt(random.nextInt(cmbltrs.length())));
		}
		return pswd;
	}

	@Override
	public void showCredentials(Employee e1) {
		System.out.println("Employee firstname: "+e1.getFirstname());
		System.out.println("Employee lastname: "+e1.getLastname());
		System.out.println("Employee Email ID: "+e1.getEmail());
		System.out.println("Employee Password: "+e1.getPassword());
		


	}




}
