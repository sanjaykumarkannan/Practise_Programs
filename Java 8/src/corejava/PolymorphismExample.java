package corejava;

class DemoA{
	public void disp() {
		System.out.println("Demo A disp() method!");
	}
}
class DemoB extends DemoA{
	public void disp() {
		System.out.println("Demo B disp() method!");
	}
	
	public void sayHello() {
		System.out.println("Saying hello from DemoB");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		DemoA obj=new DemoA();
		obj.disp();
		
		//Below is not possible, calling method of child class using parent class instance
		//obj.sayHello();
		
		DemoA obj2=new DemoB();
		obj2.disp();
	}

}
