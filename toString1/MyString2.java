package toString1;

public class MyString2 {

	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 =  ("java");
		String s3 = ("Manual");
		// here 3 objects will be created 1 in heap area 
		//and 2 in string constant pool area
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
