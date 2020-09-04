package stringMethods;

public class MyString7 {

	public static void main(String[] args) {
		String str = "testengineer";
		//lastIndexOf(char c)
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.lastIndexOf('n'));
		System.out.println(str.lastIndexOf('T'));
		System.out.println("=======================");
		//lastIndexOf(String str)
		System.out.println(str.lastIndexOf("ne"));
		System.out.println(str.lastIndexOf("re"));
		System.out.println(str.lastIndexOf("ER"));
		System.out.println("========================");
		//lastIndexOf (char c,fromIndex)
		System.out.println(str.lastIndexOf('e', 3));
		System.out.println(str.lastIndexOf('n', 5));
		System.out.println(str.lastIndexOf('t', 3));
		System.out.println("==========================");
		//lastIndexOf (String str ,fromIndex)
		System.out.println(str.lastIndexOf("eng",8));
		System.out.println(str.lastIndexOf("eer",11));
		
	}

}
