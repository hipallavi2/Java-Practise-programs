package hashCode;

public class Employee {
	String name;
	int id;
	Employee(int id, String name){
		this.name = name;
		this.id = id;
	}
	 
	public static void main(String[] args) {
		Employee e = new Employee(520,"Pallavi");
		System.out.println(e);
		System.out.println("1st employee hashCode: "+ e.hashCode());
		Employee e1 = new Employee (5210,"Amit");
		System.out.println(e1);
		System.out.println("2nd employee hashCode: "+ e1.hashCode());
	}
	public String toString() {
		return "id: "+ id + "name: "+ name;
    }
	public int hashCode() {
		return id;
	}
}
