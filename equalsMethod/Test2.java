package equalsMethod;

public class Test2 {
	int i=100;
	int j=100;
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		System.out.print("Before: ");
		System.out.println(t1==t2); 	 //comparing address
		t1=t2;							// storing t2 in t1
		System.out.print("After: ");
		System.out.println(t1==t2);		//comparing t1 and t2 values
	}

}
