package classEightAndNine;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateLetter {

//Ask the USER for a string (let’s assume they input “hello world”):
//Find and Print the Duplicated Character (it should print: l o)
	public static void main(String[] args) {
		Set<Character> repeatedChar = new LinkedHashSet<Character>();
		String str = "tomorrow";
//we need to change tochar[]
		char[] y = str.toCharArray();
//then we need to use 2 for loop like below
		for(int i=0; i<y.length; i++) {
	
			for(int j=i+1; j<y.length; j++) {
//after for loop we need to use if condition like below
		if(y[i] == y[j]) {
			repeatedChar.add(y[i]);
			//System.out.println(y[i]);
			
//in order to not ge repeated letter in console we can make set class object to prevent duplicate like above
			System.out.println(repeatedChar);
			
			
		}
	}
	
}



}
	

}
		
		
		

