package corejava;

interface intA {
	static void show() {
		System.out.println("Show from interface A");
	}

	default void hi() {
		System.out.println("Hi from interface A");
	}

	default void hello(int a) {
		System.out.println("Hello from interface A " + a);
	}
}

interface intB {
	static void show() {
		System.out.println("Show from interface B");
	}

	default void hi() {
		System.out.println("Hi from interface B");
	}

	default void hello(char a) {
		System.out.println("Hello from interface B " + a);
	}
}

abstract class absC {
	abstract void vanakkam();
}

public class InterfaceExample extends absC implements intA, intB {

	public static void main(String[] args) {
		// Static methods java
		intA.show();
		intB.show();

		System.out.println();

		// Default methods java
		InterfaceExample intObj = new InterfaceExample();
		intObj.hello(5); // hello() of intA called
		intObj.hello('S'); // hello() of intB called

		System.out.println();

		intObj.hi();

		System.out.println();

		intObj.vanakkam();
	}

	@Override
	public void hi() {
		System.out.println(
				"Overriding default method hi(), because this is present in both intA and intB, and also have same no of parameters and data type.");
		intB.super.hi();
	}

	@Override
	void vanakkam() {
		System.out.println("Vanakkam from abstract class C");
	}

}
