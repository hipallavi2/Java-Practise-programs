package stringMethods;

public class MyString1 {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(str.concat("mava"));
		//suffix
		System.out.println(str+"mava");
		//prefix
		System.out.println("mava" + str);
		System.out.println("mava" + str.concat("mava"));
	}

}
