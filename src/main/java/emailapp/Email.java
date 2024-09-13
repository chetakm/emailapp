package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String companySuffix="xyzcompany.com";
	private int defaultPasswordLength=10;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	
	
	
//	Constructor to recive firstname and lastname
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
//		System.out.println("Email Created :"+this.firstName+" "+ this.lastName);
				
//		Call a method  asking for department-return the departemnt 
		this.department=setDepartment();
//		System.out.println("The Department is :"+this.department);
	
		
//		Call a method for generate password
		this.password=randomPassword(this.defaultPasswordLength);
//		System.out.println("The Password is :"+this.password);
		
//		Combine element to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//		System.out.println("Email is :"+email);
		
	}
	
//	Ask for the department
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES :\n 1 for Slaes\n 2 for Development\n 3 for Accounting\n Enter department code: ");
		
		Scanner sc=new Scanner(System.in);
		int depchoice=sc.nextInt();
		if(depchoice==1) {return "sales";}
		else if(depchoice==2) {return "dev";}
		else if(depchoice==3) {return "acct";}
		else {
			return "Not Selected";
		}
		
		
	}
	
//	Generate the random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#%";
		char[] password =new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	
	
//	Set the mailbox capacity
	
	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
//	Set the alternate email
	public void setalternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
//	Change the password
	public void changePasword(String newpassword) {
		this.password=newpassword;
				
	}
	
	public String showInfo() {
		return "DISPLAY NAME :"+firstName+" "+lastName+"\n"+
	           "COMPANY EMAIL :"+email+"\n"+
			   "MAILBOX CAPACITY :"+mailboxCapacity;	
	}
	
	
	

}
