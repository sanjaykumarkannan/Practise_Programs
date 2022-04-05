package corejava;

public class SingletonClass {
	
	private static SingletonClass sc=new SingletonClass();
	String name="";
	
	private SingletonClass() {
		name="Sanjay Kumar";
	}
	
	public static SingletonClass getInstance() {
		return sc;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass obj=SingletonClass.getInstance();
		
		System.out.println("Obj output "+obj.name);
		System.out.println("Obj output upper "+obj.name.toUpperCase());
	}

}
