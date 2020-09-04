package toString1;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		String s = t.toString();
		System.out.println(s);
		Test t1 = new Test();
		System.out.println(t1);
		System.out.println(t1.toString());
	}
	public String toString() {      // overriding toString method 
		return "Hello Java";       
	}
}
