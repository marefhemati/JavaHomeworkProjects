package classSeven;
import classSix.ClassTwo;
public class AccessModifiers extends ClassTwo{
	
	
	private static void accessM() {
		System.out.println("Private Access Modifiers only can be accesable in same class");
	}
	
	static void defaultAcces() {
		
	}
	
	public static void main(String[] args) {
		
		//Privat access Modifier
		accessM();
	
		//Protected Access Modifier I called fron different package but we need to inherit that.
		
		
		
	}

}
