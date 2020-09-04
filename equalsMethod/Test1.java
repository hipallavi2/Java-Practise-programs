package equalsMethod;

public class Test1 {
	int i = 100;
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		System.out.println(t1.equals(t2));   //equals with variable so address level hence false
		System.out.println(t1==t2);			// operator with object variable so always address level
	}
}
