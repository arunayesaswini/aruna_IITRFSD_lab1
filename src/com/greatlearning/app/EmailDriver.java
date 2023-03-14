package com.greatlearning.app;
import java.util.*;

import com.greatlearning.model.*;
import com.greatlearning.services.*;

public class EmailDriver 
{
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your first name:");
		String fname=sc.nextLine();
		System.out.println("Enter your last name");
		String lname=sc.nextLine();


		Employee e1=new Employee(fname,lname);


		System.out.println("Please Enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Administration");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");


		int choice=sc.nextInt();
		String genemail="";
		String genpass="";


		CredServiceImpl cs=new CredServiceImpl();
		

		switch(choice)
		{
		case 1: 
			genemail=cs.generateEmailId(e1, "tech");
			genpass=cs.generatePassword();
			e1.setEmail(genemail);
			e1.setPassword(genpass);
			cs.showCredentials(e1);
			break;
		case 2: 
			genemail=cs.generateEmailId(e1,"admin");
			genpass=cs.generatePassword();
			e1.setEmail(genemail);
			e1.setPassword(genpass);
			cs.showCredentials(e1);
			break;
		case 3: 
			genemail=cs.generateEmailId(e1, "hr");
			genpass=cs.generatePassword();
			e1.setEmail(genemail);
			e1.setPassword(genpass);
			cs.showCredentials(e1);
			break;
		case 4: 
			genemail=cs.generateEmailId(e1, "legal");
			genpass=cs.generatePassword();
			e1.setEmail(genemail);
			e1.setPassword(genpass);
			cs.showCredentials(e1);
			break;
		default: System.out.println("Please Enter valid choice");

		}

		sc.close();
	}

}
