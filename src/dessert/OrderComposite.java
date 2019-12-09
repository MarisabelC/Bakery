package dessert;

import java.util.ArrayList;

public class OrderComposite {

	private ArrayList<CupcakeTemplate> cupcakeOrder;
	private CupcakeStorePrototype cupcakeStore;
	
	public OrderComposite() {
		cupcakeOrder= new ArrayList<>();
		cupcakeStore = new CupcakeStorePrototype();
	}
	
	public void addCupcake(String cupcakeFlavor) {
		CupcakeTemplate cupcake = cupcakeStore.getCupcake(cupcakeFlavor);
		cupcakeOrder.add(cupcake);
	}
	
	public void removeCupcake(CupcakeTemplate cupcake) {
		cupcakeOrder.remove(cupcake);
	}
	
	
	public void getCupcakes() {
		for (CupcakeTemplate cupcake: cupcakeOrder) {
			System.out.println(cupcake.serve());
		}
	}
}
