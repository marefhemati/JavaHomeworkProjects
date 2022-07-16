package classSeven;

public class Seven1 extends Seven2 {
	
	public static void main(String[] args) {
		A();
		b();
		Seven1 obj1 = new Seven1();
		//below is method override which I called super class under A1 method. Superclass can not be called in static method.
		obj1.A1();
		ab();
		//Below I called method overloads there 2 same method one has argument and other does'nt.
		overL("accord");
		overL();
		//I called default method from different non-sub-class.
		defaultAcces();
}
	
	public static void A() {
		
	System.out.println("A");	
	}
public void A1() {
	super.ab();
		System.out.println("A1");
	}

public static void ab() {
	
	System.out.println("AB");
}
}
