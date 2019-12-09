package dessert;

public class ChocolateCupcake extends CupcakeTemplate{
	private double chocolate; 
	public ChocolateCupcake(double flour, int eggs, double milk, double sugar, double butter, double bakingPowder,int cookTime, double chocolate) {
		super(flour, eggs, milk, sugar, butter, bakingPowder,cookTime);
		this.chocolate= chocolate;
		prepare();
		
	}
	
	@Override
	protected void putInOven() {
		System.out.println("Cooking chocolate cupcake for " + super.time + " minutes");
	}

	@Override
	protected void measureingredients() {
		System.out.println("Mesuring ingredients for chocolate cupcake: "
				+ "\n"+ super.flour + " flour: "
						+ "... and " + chocolate+ " chocolate" );
		
	}

	@Override
	protected void addIngrdients() {
		System.out.println("Adding ingredients for chocolate cupcake: "
				+ "\nflour... and chocolate" );
	}

	@Override
	protected void setFlavor() {
		super.cupcakeFlavor= "chocolate";
		
	}

	@Override
	public String serve() {
		return "Serve a chocolate cupcake";
	}

}
