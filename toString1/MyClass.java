package toString1;

public class MyClass {

	public static void main(String[] args) {
		String s1 = new String ("Java");
		System.out.println(s1);
		System.out.println("====================");
		s1=s1.concat(" is easy");
		System.out.println(s1);
		//here the old object s1 will be d-refer when we create a new object
		//because strings are immutable
	}

}
