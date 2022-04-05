package corejava;

class Rabbit implements Cloneable{
	String name;
	int age;
	
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
public class ObjectCopies {
	public static void main(String args[]) {
		Rabbit rabbit=new Rabbit();
		rabbit.setName("Sanjay");
		
		//This is Shallow Copy		
		Rabbit shallowRabbitCopy=rabbit;
		 	
		//This is deep copy
		Rabbit deepRabbitCopy=rabbit.clone();
		
		System.out.println("Shallow Copy");
		System.out.println(rabbit==shallowRabbitCopy);//True - Because both have same object reference
		System.out.println(rabbit.getName().equals(shallowRabbitCopy.getName())+"\n");//True - Same reference, so same value
		
		System.out.println("Deep Copy");
		System.out.println(rabbit==deepRabbitCopy);//False - Because both have two completely different object reference
		System.out.println(rabbit.getName().equals(deepRabbitCopy.getName()));//True - Different reference, but same value since its deep copied
	}
}
