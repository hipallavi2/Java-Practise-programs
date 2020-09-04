package toString1;

public class Employee1 {

	String name;
	int id;
	static int count = 501;
	Employee1 (String name){
		this.name = name;
		id = count ++;
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Pallavi");
		System.out.println(e1);
		System.out.println("1st employee name: "+ e1 + " and hashCode is: "+ e1.hashCode());
		System.out.println("============================");
		Employee1 e2 = new Employee1("Amit");
		System.out.println(e2);
		System.out.println("2nd employee name: "+ e2 + " and hashCode is: "+ e2.hashCode());
	}
	public String toString() {
		return name;
	}
	public int hashCode() {
		return id;
	}
}
