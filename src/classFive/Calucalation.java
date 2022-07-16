package classFive;

import java.util.Scanner;

public class Calucalation {

	public static void main(String[] args) {
		System.out.println("Give me your first number");
		Scanner calculat1 = new Scanner(System.in);
		int a = calculat1.nextInt();
		
		System.out.println("Give me your second number");
		Scanner calculat2 = new Scanner(System.in);
		int b = calculat2.nextInt();
		
		System.out.println("Select the operation, ADD, SUB, MULTI, DIV");
		Scanner opration = new Scanner(System.in);
		String select = opration.nextLine();
		
		Functions obj1 = new Functions();
		Functions obj2 = new Functions();
		
		if(select.equalsIgnoreCase("ADD")) {
			System.out.println(Functions.plus(a, b));} 
			
			 else if (select.equalsIgnoreCase("SUB")) {
				 System.out.println(Functions.subt(a, b));
				
			}
			 else if (select.equalsIgnoreCase("MULTI")) {
				 System.out.println(obj1.times(a, b));
				   }
			 else if (select.equalsIgnoreCase("DIV")) {
				 System.out.println(obj2.div(a, b));
			 }
			 else {
				 System.out.println("Wrong number");
			 }
		
		
	
	
//		switch(select) {
//		case "ADD":
//			System.out.println(Functions.plus(a, b));
//		break;
//		case "SUB":
//			System.out.println(Functions.subt(a, b));
//			break;
//		case "MULTI":
//			obj1.times(a, b);
//			System.out.println(obj1.times(a, b));
//		break;
//		case "DIV":
//			obj2.div(a, b);
//			System.out.println(obj2.div(a, b));
//		
//		}
	


	

	}

	
	}


