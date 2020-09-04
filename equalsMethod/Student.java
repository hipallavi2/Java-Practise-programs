package equalsMethod;
public class Student {
	int id;
	Student(int id1){
		this.id=id1;
	}
	public static void main(String[] args) {
		Student s1 = new Student(24);
		Student s2 = new Student (24);
		System.out.println(s1.equals(s2));
	}
	@Override
	public boolean equals(Object obj){
		Student s = (Student)obj;          //down-casting
		return this.id == s.id; //true
	}
	
}
