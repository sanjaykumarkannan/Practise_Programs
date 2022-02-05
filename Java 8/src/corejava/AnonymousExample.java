package corejava;


class A {
	public void hi() {
		System.out.println("HII");
	}
	
	public void hello() {
		System.out.println("HELLOO");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		A obj=new A();
		obj.hi();
		obj.hello();
		
		
		//Below is called an anonymous inner class. This class doesnt have a name, 
		//but it extends A class and overrides only hello() method of A class.
		
		A obj2=new A() {
			
			public void hello() {
				System.out.println("Hello Sanjay!");
			}
		};
		
		obj2.hi();
		obj2.hello();
	}

}
