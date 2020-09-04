package finalize;

public class MyDemo {
	int i = 20;
	public static void main(String[] args) {
		System.out.println("Main Starts");
		MyDemo md = new MyDemo();
		System.out.println("I value is: "+ md.i);
		System.gc();
		System.out.println("Main ends");
	}
	protected void finalize()throws Throwable{
		System.out.println("Object Destroyed");
	}
}
