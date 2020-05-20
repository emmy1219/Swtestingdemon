package javaEdureka;
import java.util.Scanner;

public class Resturant {

	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] menudrinks= {"Carbonated drink","Juice","AlcoholDrinks",};
		double CarPrice= 2.50;
		double juicePrice= 1.50;
		double alcoholPrice= 5.50;
		int noOfDrink = 2;
		
		System.out.println("Please select a Drink"+"\n"+ "Carbonated drink"+"\n"+" Juice"+"\n"+" Alcohol");
		for(String drinks : menudrinks) {
			if (drinks.equals("carbonated drink")) {
				double totalprice= noOfDrink*CarPrice;
				System.out.println("Drink price Is:"+ totalprice);
			}else if(drinks.equals("juice") ){
				double totalprice= noOfDrink*juicePrice;
				System.out.println("Drink price Is:"+ totalprice);
			}else if(drinks.equals("juice") ){
				double totalprice= noOfDrink*juicePrice;
				System.out.println("Drink price Is:"+ totalprice);
			}
			else {
				double totalprice= noOfDrink*juicePrice;
				System.out.println("Drink price Is:"+ totalprice);
			}
			
		} 
		
		
	input.next();
		
	
		
		
		
			

	

}//main
}//class
