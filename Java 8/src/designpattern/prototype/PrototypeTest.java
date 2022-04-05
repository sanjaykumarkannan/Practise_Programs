package designpattern.prototype;

class Rabbit implements Cloneable{
	String name;
	
	public Rabbit() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Rabbit clone() {
		Rabbit rabbitCopy = null;
		try {
			rabbitCopy = (Rabbit) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return rabbitCopy;
	}
}
public class PrototypeTest {
	public static void main(String args[]) {
		Rabbit rabbit=new Rabbit();
		rabbit.setName("Sanjay");
		
		Rabbit rabbitCopy=rabbit.clone(); 
		rabbitCopy.setName("Srimathi");
		
		System.out.println("rabbit name :: "+rabbit.getName());
		System.out.println("rabbitCopy name :: "+rabbitCopy.getName());

	}
}
