package equalsMethod;

public class SingleTon {
	static SingleTon st;
	static int count = 1;
	private SingleTon() {
		count++;
	}
	public static SingleTon getInstance() {
		if(count==1) {
			st = new SingleTon();
		}
		return st;
	}
	public static void main(String[] args) {
		SingleTon ref1 = SingleTon.getInstance();
		SingleTon ref2 = SingleTon.getInstance();
		SingleTon ref3 = SingleTon.getInstance();
		System.out.println(ref1==ref2);
		System.out.println(ref3==ref1);
	}
}
