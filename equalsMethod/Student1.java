package equalsMethod;

public class Student1 {
	String name;
	Student1 (String name){
		this.name=name;
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1("Pallavi");
		Student1 s2 = new Student1("Pallavi");
		System.out.println(s1.equals(s2));
	}
	@Override
	public boolean equals(Object obj) {
		Student1 s = (Student1)obj;
		return this.name.equals(s.name);
	}
}
