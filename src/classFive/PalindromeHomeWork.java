package classFive;

import java.util.Scanner;

public class PalindromeHomeWork {

	public static void main(String[] args) {
		System.out.println("Give me a String");
		Scanner ui = new Scanner (System.in);
		String word = ui.next();
		char[] str = word.toCharArray();
		String add = "";
		for(int i=word.length()-1; i>=0; i--) {
			
			add=add+str[i];
			
		}
		System.out.println(add);
		if (word.equalsIgnoreCase(add)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	} 

}
