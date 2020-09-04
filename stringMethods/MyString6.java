package stringMethods;

public class MyString6 {

	public static void main(String[] args) {
		String str = "testengineer";
		//indexOf (char c)
		System.out.println(str.indexOf('t'));
		System.out.println("=========================");
		//indexOf(char c,fromIndex)
		System.out.println(str.indexOf('e',0));
		System.out.println(str.indexOf('e',3));
		System.out.println(str.indexOf('n',5));
		System.out.println(str.indexOf('e', 11));
		System.out.println("========================");
		//index of (string str)
		System.out.println(str.indexOf("ten"));
		System.out.println(str.indexOf("engineer"));
		System.out.println(str.indexOf("ein"));
		System.out.println(str.indexOf("Testengineer"));
		System.out.println("==========================");
		//index of (string str,int fromIndex)
		String str1 = "javajava";
		System.out.println(str1.indexOf("va",3));
		System.out.println(str1.indexOf("av",0));
		System.out.println(str1.indexOf("Ja",0));
	}

}
