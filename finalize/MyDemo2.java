package finalize;

public class MyDemo2 {
	int i = 20;
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Starts");
		MyDemo md = new MyDemo();
		System.out.println("I value is: "+ md.i);
		md = null;
		System.gc();
		Thread.sleep(100);
		System.out.println("Main ends");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Objects destroyed");
	}
}
