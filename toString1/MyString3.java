package toString1;

public class MyString3 {

	public static void main(String[] args) {
		String s1 = new String ("Java"); 
		String s2 = ("java");
		//here 3 object will be create 1 in heap area 
		//and 2 in string constant pool area
		System.out.println(s1);
		System.out.println(s2);
		// java is case sensitive so here content is not same
		
	}

}
