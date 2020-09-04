package stringMethods;

public class StringOperations {

	public static void main(String[] args) {
		
		String s = "Java Programming Language";
		//finding string is empty or not
		System.out.println(s.isEmpty());
		
		//finding length of the string
		System.out.println(s.length());
		
		String s1 = "";
		String s2 = " ";
		String s3 = new String("");
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		//printing string object
		System.out.println(s);
		
		//comparing 2 string 
		String s4= new String ("abc");
		String s5= new String ("abc");
		String s6= new String ("Abc");
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		//comparing string without case,below method is defined in String class
		//public boolean equalsIgnoreCase(String s)
		
		String s7 = new String ("a");
		String s8 = new String ("A");
		System.out.println(s7.equals(s8));
		System.out.println(s7.equalsIgnoreCase(s8));
		
		//startsWith()/endsWith()
		String s9 = "Java Programming Language";
		System.out.println(s9);
		System.out.println(s.startsWith("Java"));
		System.out.println(s.startsWith("java"));
		System.out.println(s.startsWith("hari"));
		
		System.out.println(s.endsWith("hari"));
		System.out.println(s.endsWith("Language"));
		
		//print character of the given index
		//public char chatAt(int index)
		String s10 = new String ("Java Programming Language");
		System.out.println("character at 10th index :" + s10.charAt(10));
		System.out.println(s10.charAt(0));
		System.out.println(s10.charAt(10));
		//System.out.println(s10.charAt(-10)); SIOBE
		//System.out.println(s10.charAt(26));  SIOBE
		
		//finding index of given character of string in the given string
		System.out.println(s10.indexOf('a'));
		System.out.println(s10.lastIndexOf('a'));
		System.out.println(s10.indexOf('a', 4));
		System.out.println(s10.lastIndexOf('a',22));
		System.out.println(s10.lastIndexOf('a', 21));
		System.out.println(s10.indexOf("hari"));
		
		//substring
		System.out.println(s10.substring(5));
		System.out.println(s10.substring(5, 15));
		System.out.println(s10.substring(5, 16));
		//System.out.println(s10.substring(-6)); SIOBE
		System.out.println(s10.substring(5, 25));
		//System.out.println(s10.substring(5, 26)); SIOBE
		System.out.println(s10.substring(24, 25));
		System.out.println(s10.substring(s10.indexOf('P'),s10.indexOf("L")));
		System.out.println(s10.substring(s.indexOf("Language")));
		String s11 = "Pallavi Singh";
		String s12 = s11.replace('J', 'K');
		System.out.println("s11 String : " + s11 );
		System.out.println("s12 String : " + s12);
		String str13 = s11.replace('a','A');
		System.out.println("str13 String: " + str13);
		//
		String str14 = str13.trim();
		System.out.println(str13);
		System.out.println(str14);
		System.out.println(str13==str14);
		
		
	}

}
