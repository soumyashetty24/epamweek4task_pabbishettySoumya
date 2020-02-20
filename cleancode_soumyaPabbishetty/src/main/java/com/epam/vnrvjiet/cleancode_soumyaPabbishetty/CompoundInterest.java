package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;
public class CompoundInterest {
	double principalAmount;
	double timePeriodInMonths;
	double rateOfInterest;
	int compoundedType;
	double totalAmount;
	double CompoundInterest=0;
	Scanner sc=new Scanner(System.in);
	void readInput()
	{
		System.out.println("Enter the Principal Amount:");
		 principalAmount=sc.nextInt();
		System.out.println("Enter the Time period in months:");
		 timePeriodInMonths=sc.nextInt();
		System.out.println("Enter the Rate of Interest(in %):");
		rateOfInterest=sc.nextInt();
		System.out.println("Select an option how amount is compounded:");
		System.out.println("1.Annually\n2.Half-Yearly\n3.Quarterly\n");
		compoundedType=sc.nextInt();
		
		
	 }
	void caluclateSimpleInterest()
	 {  if(compoundedType==1)
	    timePeriodInMonths=timePeriodInMonths/12;
	    else if(compoundedType==2)
		timePeriodInMonths=timePeriodInMonths/6;
     	else
		timePeriodInMonths=timePeriodInMonths/3;
	 
   totalAmount=(principalAmount*Math.pow(1+(rateOfInterest/100),timePeriodInMonths));
   CompoundInterest=(totalAmount-principalAmount);
       System.out.println("TotalAmount is:"+ totalAmount);
		System.out.println("CompoundInterest is:"+CompoundInterest);
		
		 
	 }
	

}
