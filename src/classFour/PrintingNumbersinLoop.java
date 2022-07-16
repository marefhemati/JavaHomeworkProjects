package classFour;

import java.util.Scanner;

public class PrintingNumbersinLoop {

	public static void main(String[] args) {
		System.out.println("Tell me a number");
		Scanner ui = new Scanner(System.in);
		int N = ui.nextInt();
		
		for(int i=0; i<=N; i=i+1) {
			System.out.println(i);
		}
	}

}
