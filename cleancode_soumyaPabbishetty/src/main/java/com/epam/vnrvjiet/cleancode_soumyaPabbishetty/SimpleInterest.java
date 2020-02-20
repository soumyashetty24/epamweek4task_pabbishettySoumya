package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;
public class SimpleInterest {
	double principalAmount;
	double timePeriodInMonths;
	double rateOfInterest;
	double simpleInterest=0;
	Scanner sc=new Scanner(System.in);
	void readInput()
	{
		System.out.println("Enter the Principal Amount:");
		 principalAmount=sc.nextInt();
		System.out.println("Enter the Time period in months:");
		 timePeriodInMonths=sc.nextInt();
		System.out.println("Enter the Rate of Interest(in %):");
		rateOfInterest=sc.nextInt();
		
	 }
	void caluclateSimpleInterest()
	{
		
			timePeriodInMonths=timePeriodInMonths/12;
	
		
		simpleInterest=(principalAmount*timePeriodInMonths*rateOfInterest)/100;
		System.out.println("SimpleInterest is:"+simpleInterest+"\n");
		 
	 }
	

}
