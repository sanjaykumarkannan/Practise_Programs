package corejava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Movies{
	public String name=null;
	private double rating;
	protected int releaseYear=2020;
	
	public Movies() {
		System.out.println("Hi, this is Movies constructor!");
	}
	
	public void method1() {
		System.out.println("Movies class method1()");
	}
	
	public void method2(String name) {
		System.out.println("Movies class method2() || movie name => "+name);
	}
	
	private void method3() {
		System.out.println("Private method3() of Movies class. Rating of above movie is : "+rating);
	}	
}
public class ReflectionApi {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Movies m=new Movies();
		
		//Class
		Class cl=m.getClass();
		System.out.println("Class name : "+cl.getName());
		
		//Constructor
		Constructor c=cl.getConstructor();
		System.out.println("Name of constructor is : "+c.getName());
		
		//Methods
		System.out.println("\nMethods : ");
		Method methods[]=cl.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		Method method2=cl.getDeclaredMethod("method2", String.class);
		method2.invoke(m, "Bahubali");
		
		//Fields
		System.out.println("\nFields : ");
		Field fields[]=cl.getFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
		//Accessing private fields and methods
		System.out.println();//To leave a line
		Field f1=cl.getDeclaredField("rating");
		f1.setAccessible(true);
		f1.set(m,8.9);
		
		Method method3=cl.getDeclaredMethod("method3");
		method3.setAccessible(true);
		method3.invoke(m);
		
		//Accesing protected field value which is already set in class
		Field f2=cl.getDeclaredField("releaseYear");
		f2.setAccessible(true);
		System.out.println("\nRelease year of above movie is : "+f2.get(m));
	}

}
