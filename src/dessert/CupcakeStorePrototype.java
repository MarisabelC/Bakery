package dessert;

import java.util.HashMap;
import java.util.Map;

public class CupcakeStorePrototype {
	
	private Map<String, CupcakeTemplate> cupcakeConatiner;
	
	public CupcakeStorePrototype() {
		cupcakeConatiner= new HashMap<>();
		addCupcake();
	}
	
	private void addCupcake() {
		cupcakeConatiner.put("chocolate",new ChocolateCupcake(500, 3, 200, 125, 3.5, 1.5, 35, 125));
		cupcakeConatiner.put("vanilla", new VanillaCupcake(425, 3, 200, 300, 3, 2, 30, 2));
		cupcakeConatiner.put("banana", new BananaCupcake(300, 4, 100, 150, 2, 2, 45, 2.5));
	}
	
	public CupcakeTemplate getCupcake(String cupcakeFlavor) {
		return (CupcakeTemplate)cupcakeConatiner.get(cupcakeFlavor.toLowerCase()).clone(); 
	}

}
