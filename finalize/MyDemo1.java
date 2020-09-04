package finalize;

public class MyDemo1 {
	int i = 20;
	public static void main(String[] args) {
		System.out.println("Main Starts");
		MyDemo1 md = new MyDemo1();
		System.out.println("I value is: "+ md.i);
		md=null;
		System.gc();
		System.out.println("Main Ends");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
    }

}
