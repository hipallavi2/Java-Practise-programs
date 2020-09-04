package stringMethods;

public class MyClass9 {

	public static void main(String[] args) {
		String str = "testengineer";
		//substring (int startIndex,int endIndex)
		System.out.println(str.substring(3, 5)); // it will go till (5-1) = 4
		System.out.println(str.substring(4,11));
		System.out.println(str.substring(0, 4));
		//System.out.println(str.substring(0, 30)); exception 
		System.out.println("===================");
		System.out.println(str.substring(1, 1));
		String s = str.substring(5,5);
		System.out.println("s value is :+ "+s);
	}

}
