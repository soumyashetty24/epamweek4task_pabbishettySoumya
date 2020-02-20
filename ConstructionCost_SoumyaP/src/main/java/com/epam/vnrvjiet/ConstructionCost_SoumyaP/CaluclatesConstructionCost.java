package com.epam.vnrvjiet.ConstructionCost_SoumyaP;
import java.util.*;
public class CaluclatesConstructionCost {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double totalCost,landArea;
		long costOfMaterial;
		System.out.print("Enter land size in(sq yards):\n");
		landArea=sc.nextInt();
		System.out.print("Select the type of Materials:\n ");
		MaterialsType materialsTypeObject = new MaterialsType();
		costOfMaterial=materialsTypeObject.MaterialCost();
		System.out.println("The Total Cost To Construct Your Land With your Specification is INR: "+(costOfMaterial*landArea)+"/-");
		sc.close();
	}
}
