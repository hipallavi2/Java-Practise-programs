package anonymousInnerClass;

public class MyClassDemo implements MyDemo{

	public static void main(String[] args) {
		MyDemo md = new MyDemo()
				{
					public void display()
					{
						System.out.println("Display in AIC");
					}
				};
			md.display();
	}
	public void display() {
		
	}
}
