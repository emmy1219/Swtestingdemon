package javaEdureka;

import java.util.Scanner;

public class Assingment03 {

		public static void display(String regno[], String Empname[], double salary[])
		{
			
			System.out.println("\nID \t Name \t Salary");
			for(int i = 0;i<5;i++)
			{
			
				System.out.print("\n"+regno[i]+"\t"+Empname[i]+"\t"+salary[i]);
			}
		}
		public static void display(String regno[], String Empname[])
		{
			System.out.println("\n\nID \t Name ");
			for(int i = 0;i<5;i++)
			{
				System.out.print("\n"+regno[i]+" \t "+Empname[i]);
			}
		}
		public static void display(String name, String regno[], String Empname[], double salary[] )
		{
			int i;
			for(i = 0;i < 5; i++)
			{
				if(name.equals(Empname[i]))
				{
					System.out.println("\nID \t Name \t Salary");
					System.out.println(regno[i]+"\t"+Empname[i]+"\t"+salary[i]);
					break;
				}
			}
			if(i == 5)
			{
				System.out.println("No records found!!");
			}
		}
		public static void main(String ar[])
		{
			
			Scanner sc = new Scanner(System.in);
			
			String regno[] = new String[5];
			String Empname[] = new String[5];
			double salary[] = new double[5];
			
			for(int i=0 ;i<5;i++)
			{
				System.out.print("Enter ID : ");
				regno[i] = sc.next();
				System.out.print("Enter name : ");
				Empname[i] = sc.next();
				System.out.print("Enter salary : ");
				salary[i] = sc.nextDouble();
			}
			
			display(regno, Empname, salary);
			System.out.println();
			display(regno, Empname);
			System.out.println();
			System.out.println("\nEnter name to search: ");
			String name_search = sc.next();
			display(name_search, regno, Empname, salary);
		
		
		
		
		
		
		
		
		
		
		
	}

}
