package classThree;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner uInput = new Scanner(System.in);
		System.out.println("Please enter a String");  //Ask the USER for a string (it should print “Please enter a String:”)
		String ueser = uInput.nextLine();
		System.out.println(ueser.toUpperCase());   //Convert that string to all uppercase and print it (it should print “HELLO”)
		String a = ueser.toUpperCase();
		System.out.println(a.length());  //Print the length of that string (it should print 5)
		System.out.println(a.replace("O", "Z")); //Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
		String b = a.replace("O", "Z");
		System.out.println(b.charAt(4));
		
		System.out.println(ueser.concat( " test"));
		
	    

	}

}
