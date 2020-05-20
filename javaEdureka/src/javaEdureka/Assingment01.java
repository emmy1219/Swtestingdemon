package javaEdureka;
import java.util.Scanner;
public class Assingment01 {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		String[] ID = new String[5];
		
		String[] Name = new String[5];
		
		int[] Salary = new int[5];
		
		
			for(int i = 0 ; i < 5 ; i++){
			
				System.out.println("Enter Employee"+(i+1)+" ID ");
				ID[i]=  input.next();
				
			System.out.println("Enter Employee"+(i+1)+ " Name  ");
			Name[i]=  input.next();
			
			
			System.out.println("Enter Employee " +(i+1)+"Salary  ");
			Salary[i]=  input.nextInt();
				
			}
			
			display(ID,Name,Salary);
			
	}//main method
	public static void display(String[] ID  , String[] Name,int[] Salary){

				System.out.println("ID\tName\tSalary");

				for(int i = 0 ; i < 5 ; i++){

				System.out.println(ID[i] +"\t"+Name[i]+"\t"+Salary[i]);

	 }

	}//user defined			
			

}//class end
