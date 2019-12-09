package dessert;

public class VanillaCupcake extends CupcakeTemplate{
	private double vanilla;
	
	public VanillaCupcake(double flour, int eggs, double milk, double sugar, double butter, double bakingPowder,int cookTime, double vanilla) {
		super(flour, eggs, milk, sugar, butter, bakingPowder,cookTime);
		this.vanilla= vanilla;
		prepare();
	}
	
	@Override
	protected void putInOven() {
		System.out.println("Cooking vanilla cupcake for " + super.time + " minutes");
	}

	@Override
	protected void measureingredients() {
		System.out.println("Mesuring ingredients for vanilla cupcake: "
				+ "\n"+ super.flour + " flour: "
						+ "... and " + vanilla+ " tsp vanilla" );
		
	}

	@Override
	protected void addIngrdients() {
		System.out.println("Adding ingredients for vanilla cupcake: "
				+ "\nflour ... and vanilla" );
	}

	@Override
	protected void setFlavor() {
		super.cupcakeFlavor="vanilla";
		
	}
	
	@Override
	public String serve() {
		return "Serve a vanilla cupcake";
	}


}
