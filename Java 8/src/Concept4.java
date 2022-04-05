
public class Concept4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int) 1.1234567898765432123456789;
		float b=(float) 1.1234567898765432123456789;
		double c=1.1234567898765432123456789;
		
		System.out.println("int : "+a);
		System.out.println("float : "+b);
		System.out.println("double : "+c);
		
		
		int d= 2147483647; // 4 bytes or 32 bit
		long e= 2147483647; //8 bytes or 64 bit
		short f=(short) 2147483647; //2 bytes or 16 bit

		//(There is some issue with the below long, ideally it should accept more values)
		System.out.println("int : "+d);
		System.out.println("long : "+e);
		System.out.println("short : "+f);
	}

}
