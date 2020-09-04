package hashCode;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d); // printing fully qualified class name @address
		int h = d.hashCode();	
		System.out.println("1st object hashCode: "+ h); // printing hashCode of h object
		Demo d2 = new Demo();
		System.out.println(d2); // printing fully qualified class name @address
		int h1 = d2.hashCode();
		System.out.println("2nd object hashCode: "+ h1);  // printing hashCode of h1 object
	}
}
