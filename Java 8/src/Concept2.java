
class Test  extends Thread{
	public void run() {
		System.out.println("Run");
	}
}
public class Concept2{
	
	public static void main(String[] args) {
		Test t=new Test();
		t.run();
	}

}
