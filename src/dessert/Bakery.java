package dessert;

public class Bakery {

	public static void main(String[] args) {
		OrderComposite order= new OrderComposite();
		
		order.addCupcake("chocolate");
		order.addCupcake("vanilla");
		order.addCupcake("chocolate");
		order.addCupcake("vanilla");
		order.addCupcake("vanilla");
		order.addCupcake("banana");
		order.getCupcakes();
		
	}

}
