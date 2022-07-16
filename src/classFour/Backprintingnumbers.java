package classFour;

import java.util.Scanner;

public class Backprintingnumbers {

	public static void main(String[] args) {
		System.out.println("Tell me a number");
		Scanner ui = new Scanner(System.in);
		int N = ui.nextInt();
		
		for(int i=N; i>=0; i=i-1) {
			System.out.println(i);
		}
	}

}
