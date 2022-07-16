package classSix;

public class ClassTwo {
	
	public ClassTwo() {
		this(2009, "Rav4" );
	System.out.println("Toyota");
	}
public ClassTwo(String price) {
	
	System.out.println("car price"+" "+price);
		
	}
public ClassTwo(int a, String b) {
	this("$7000");
	
	System.out.println("Toyota"+" "+ a+" "+b);
	
}
protected static void protAccessModi() {
	System.out.println("Protected access modifier can be accesibale in different package but needs to inherit to that class");
}

}
