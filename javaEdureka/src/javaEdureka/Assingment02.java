package javaEdureka;
import java.util.Scanner;
public class Assingment02 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		
		String[] ID = new String[5];
		
		String[] Name = new String[5];
		
		for(int i = 0 ; i < 5 ; i++){
			
				System.out.println("Enter Employee"+(i+1)+" ID ");
				ID[i]=  input.next();
				
			System.out.println("Enter Employee"+(i+1)+ " Name  ");
			Name[i]=  input.next();
			
			}
			
			display(ID,Name);
			
	}//main method
	public static void display(String[] ID  , String[] Name){

				System.out.println("ID\tName");

				for(int i = 0 ; i < 5 ; i++){

				System.out.println(ID[i] +"\t"+Name[i]);

	 }	
		
		
		
			
		
		
		
	}

}
