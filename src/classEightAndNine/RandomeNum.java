package classEightAndNine;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class RandomeNum {

//Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)
	//Simply we can google it like: generating random number in range. We got below formula.
	//int randomNum = ThreadLocalRandom.current().nextInt(min, max +1);
	public static void main(String[] args) {
//	int randomNum = ThreadLocalRandom.current().nextInt(100, 1000 +1);
//	System.out.println(ThreadLocalRandom.current().nextInt(100, 1000 +1));
		
	// it said 500 random number instead of printing 500 time we can use for loop. before for loop it we should 
		for(int i=0; i<7; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(100, 1000 +1));
		// it print 7 random number, if question be 500 unique number then we should use set to not allow duplicate 
		
		}
Set<Integer> mySet = new TreeSet<Integer>();
mySet.add(ThreadLocalRandom.current().nextInt(100, 1000 +1));
	}

}
