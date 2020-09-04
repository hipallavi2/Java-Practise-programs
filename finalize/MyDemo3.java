package finalize;

public class MyDemo3 {
	MyDemo3 md;
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Starts");
		MyDemo3 md1 = new MyDemo3();
		MyDemo3 md2 = new MyDemo3();
		MyDemo3 md3 = new MyDemo3();
		md1.md = md2;          // island of isolation
		md2.md = md3;			// island of isolation
		md3.md = md1;			 // island of isolation
		md1 = null;					// d-refer with null
		md2 = null;					// d-refer with null
		md3 = null;					// d-refer with null
		System.gc();
		Thread.sleep(5000);
		System.out.println("Main ends");
	}
}
