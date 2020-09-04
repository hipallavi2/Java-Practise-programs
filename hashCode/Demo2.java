package hashCode;

public class Demo2 {

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		System.out.println(d);	// printing fully qualified class name @ address
		int i = d.hashCode();
		System.out.println("1st obj hashCode: "+ i);
		
		Demo2 d1 = new Demo2();
		System.out.println(d1);  // printing fully qualified class name @ address
		int i2 = d1.hashCode();
		System.out.println("2nd obj hashCode: "+ i2);
	}
	public int hashCode() {			// overriding hashCode ()
		return 501;
	}
}
