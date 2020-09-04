package stringMethods;

public class MyString10 {

	public static void main(String[] args) {
		String str = "testengineer";
		//equals
		System.out.println(str.equals("testengineer"));
		System.out.println(str.equals("dengineer"));
		System.out.println(str.equals("Testengineer"));
		System.out.println("============================");
		//contains()
		System.out.println(str.contains("test"));
		System.out.println(str.contains("eng"));
		System.out.println(str.contains("eing"));
		System.out.println(str.contains("Test"));
		System.out.println("============================");
		//equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase("Testengineer"));
		System.out.println(str.equalsIgnoreCase("Test"));
		System.out.println(str.equalsIgnoreCase("testengineer"));
		System.out.println("=============================");
		//startsWith()
		System.out.println(str.startsWith("test"));
		System.out.println(str.startsWith("engineer"));
		System.out.println("===============================");
		//endsWith
		System.out.println(str.endsWith("eer"));
		System.out.println(str.endsWith("EER"));
		System.out.println("================================");
		//contentEquals
		System.out.println(str.contentEquals("testengineer"));
		System.out.println(str.contentEquals("test"));
		
		
	}

}
