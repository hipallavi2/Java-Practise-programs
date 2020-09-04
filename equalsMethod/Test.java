package equalsMethod;

public class Test {
	int i = 100;
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1.equals(t2)); //equals with variable so address level hence o/p is false
		System.out.println("==============");
		System.out.println(t1);
		System.out.println(t2);
	}
}
