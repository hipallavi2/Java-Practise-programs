package stringMethods;

public class MyString3 {

	public static void main(String[] args) {
		String str = "testengineer"; 
		//index =     01234567891011
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(8));
		//System.out.println(str.charAt(20));// exception because char is out of range
		//System.out.println(str.charAt(-3)); //exception because char is out of range
	}

}
