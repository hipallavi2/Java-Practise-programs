package anonymousInnerClass;

public class MyPizzaDay {

	public static void main(String[] args) {
		DoubleCheesePizza dp = new DoubleCheesePizza();
		dp.cheese();
		CheeseGarlicBread cg = new CheeseGarlicBread();
		cg.cheese();
		Pizza p = new Pizza()
				{
					public void cheese()
					{
						System.out.println("Cheese Spicy Pizza");
					}
				};
		p.cheese();
	}
}
