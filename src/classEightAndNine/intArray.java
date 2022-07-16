package classEightAndNine;

public class intArray {
	
	

	public static void main(String[] args) {
		System.out.println();
// int a = 4;
// int b = 10;
// //Interview Question: I give you two variable can you swap the value?
// //Yes I can we create a new variable like below.
// int tem;
// tem= a;
// a = b;
// b= tem;
//System.out.println(a);
 
		//Interview Question: Create a Int Array[] with unsorted numbers and sort without using Arrays.sort() function?
		int[] n = {7, 78, 4,34, 10, 1, 3, 37, 2,15};
		System.out.println(n[0]);
		int temp;
		for(int i=0; i<n.length; i++) {
			for(int j=i+1; j<n.length; j++) {
				if(n[i]>n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
					System.out.println(n[0]);
				}
				
			}
		}
	}

	//or Interview Question may like this
	//I give you an integer array you create method and sort them with out using array.sort?
	//it is almost same just create method and all for loop and if condition inside method and then print them inside mean method.
public static void sortGivenInArray1(int[]n) {
		
	int[] x = {7, 78, 4,34, 10, 1, 3, 37, 2,15};
	System.out.println(n[0]);
	int temp;
	for(int i=0; i<n.length; i++) {
		for(int j=i+1; j<n.length; j++) {
			if(n[i]>n[j]) {
				temp = n[i];
				n[i] = n[j];
				n[j] = temp;
				System.out.println(n[0]);
			}
		}
	}
}
}
	

