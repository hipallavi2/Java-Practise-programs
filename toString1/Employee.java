package toString1;

public class Employee {
		String name;
		int id;
		Employee(int id, String name){
			this.name = name;
			this.id = id;
		}
		public static void main(String[] args) {
		Employee e = new Employee(5128,"Pallavi");
		System.out.println(e);
		Employee e1 = new Employee(2524,"Amit");
		System.out.println(e1);
	}
		public String toString() {
			return "id: " + id +" , "+ "name: "+ name;
		}
}
