package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;
public class InterestCaluclator {
	public static void main(String args[])
	{   
		Scanner sc=new Scanner(System.in);
		int doYouContinue=1;

		do {
		System.out.println("What do you want us to caluclate!!");
		System.out.println("1.SimpleInterest\t2.CompoundInterest");
		int interestType=sc.nextInt();
		try
		{
			switch(interestType)
			{
			case 1:SimpleInterest si=new SimpleInterest();
			       si.readInput();
			       si.caluclateSimpleInterest();break;
			case 2:CompoundInterest ci=new CompoundInterest();
			       ci.readInput();
			       ci.caluclateSimpleInterest();break;
			}
			System.out.println("Do you want to Continue enter( 1 for yes/0 for no):");
			doYouContinue=sc.nextInt();
		
		       
		    
		}
		catch(Exception e)
		{
			System.out.println("You can Select only 2 choices(1/2)!!");
			doYouContinue=0;
		}
		}while(doYouContinue==1);
	
		sc.close();
	}
	

}
