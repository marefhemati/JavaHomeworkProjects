package classFour;

import java.util.Scanner;

public class PrintingWordbySyntax {

	public static void main(String[] args) {
		
		System.out.println("Tell me a word");
		Scanner ui = new Scanner(System.in);
		String a = ui.nextLine();
		
		for(int i=0; i<a.length(); i=i+1) {
			System.out.println(a.charAt(i));
		}
	}

}
