package com.epam.vnrvjiet.ConstructionCost_SoumyaP;
import java.util.*;
public class MaterialsType {
	public int MaterialCost() {
	Scanner sc=new Scanner(System.in);
	int costArray[]= {1200,1500,1800,2300};
	System.out.println("Select the specification from the following options:");
	System.out.println("1.Standard Material:INR 1200/- only\n2.Above Standard Material:INR 1500/- only\n3.High Standard Material:INR 1800/- only\n4.High Standard Material and Fully Automated Home:INR 2500/- only\n");
	int materialType;
	materialType=sc.nextInt();
	return costArray[materialType-1];
	}

}
