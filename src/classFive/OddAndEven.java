package classFive;

import java.util.Scanner;

public class OddAndEven {
	
	
		
	

	public static void main(String[] args) {
		
	
		System.out.println("Give me your number");
		Scanner N = new Scanner(System.in);
		int ui = N.nextInt();
		
		if(ui % 2 == 0) {
			
			System.out.println("Even");
		}else {
			System.out.println("Odd");	
		}

	}
	
	
	}


