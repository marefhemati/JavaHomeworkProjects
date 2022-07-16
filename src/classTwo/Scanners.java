package classTwo;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		 Scanner UserInput = new Scanner (System.in);
		
		 String name = UserInput.nextLine();
		 System.out.println(name);
		 
		 System.out.println("How old are you");
		 int age = UserInput.nextInt();
		 System.out.println(age);
		 
		 System.out.println("What is your gender?");
		 String gender = UserInput.next();
		 System.out.println(gender);
		 
		 System.out.println("Where are you from?");
		 String place = UserInput.next();
		 System.out.println(place);
		
		 System.out.println("Where do you live?");
		 String living = UserInput.next();
		 System.out.println(living);
		 
		 System.out.println("Where do you work?");
		 String work = UserInput.nextLine();
		 System.out.println(work);
		 
		 System.out.println("What is your job role?");
		 String jobRoll = UserInput.next();
		 System.out.println(jobRoll);
		 
		 System.out.println("What is your salary?");
		 int salary = UserInput.nextInt();
		 System.out.println(salary);
		 
		 System.out.println("How much raise are you getting next year?");
		 double raisSalary = UserInput.nextDouble();
		 
		 
		// My name is James Bond. I am 40 years old, male. I work at IBM as Automation Engineer.
		 //I currently live in New York. I am originally from England. I make 100000.00 dollar.
		 //I will get 50000.00 as annual raise so my total salary would be 150000.00 dollar next year.
		 
		 System.out.println("My name is" + name + ". I am "+ age + " years old, " + gender + "." + "I work at" + work + "as"
		 + jobRoll + "." + "I currently live in" + living + "." + "I am originally from" + place + "." + "I make 100000.00 dollar.\r\n"
		 		+ "	 I will get" + raisSalary + "as annual raise so my total salary would be" + salary + "dollar next year." );
	}

}
