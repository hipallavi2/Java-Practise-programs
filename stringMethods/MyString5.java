package stringMethods;
// index of method
public class MyString5 {

	public static void main(String[] args) {
		String str = "testengineer";
		System.out.println(str.indexOf('g'));
		System.out.println(str.indexOf('i'));
		//q is not the part of test engineer hence o/p is -1
		System.out.println(str.indexOf('q'));
		//T is capital and java is case sensitive so it will give o/p -1
		System.out.println(str.indexOf('T'));
		// char n has been repeated twice so it will always return first char index value
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf('e'));
	}
}
