package equalsMethod;

public class MyTest {
	// over riding using string class
	public static void main(String[] args) {
		MyTest m1 = new MyTest();
		MyTest m2 = new MyTest();
		System.out.println(m1.equals(m2));
		System.out.println("=================");
		String s1 = new String ("Ram");
		String s2 = new String ("Ram1");
		System.out.println(s1.equals(s2));  // content level comparison hence true
		System.out.println(s1==s2);			// equal operator cannot overidden
		}
}
