package equalsMethod;

public class DemoTest {
	public void display() {
		System.out.println("Display Method");
		System.out.println("this address: "+ this);
		System.out.println("hashCode value: "+ this.hashCode());
	}
	public static void main(String[] args) {
		DemoTest dt = new DemoTest();
		dt.display();
		System.out.println(dt);
		System.out.println("1st object hashCode: "+ dt.hashCode());
		DemoTest dt1 = new DemoTest();
		System.out.println(dt1);
		System.out.println("2nd object hashCode: "+ dt1.hashCode());
	}

}
