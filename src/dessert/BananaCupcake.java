package dessert;

public class BananaCupcake extends CupcakeTemplate{

	private double banana;
	
	public BananaCupcake(double flour, int eggs, double milk, double sugar, double butter, double bakingPowder,int cookTime, double banana) {
		super(flour, eggs, milk, sugar, butter, bakingPowder,cookTime);
		this.banana= banana;
		prepare();
	}
	
	@Override
	protected void putInOven() {
		System.out.println("Cooking banana cupcake for " + super.time + " minutes");
	}

	@Override
	protected void measureingredients() {
		System.out.println("Mesuring ingredients for banana cupcake: "
				+ "\n"+ super.flour + " flour: "
						+ "... and " + banana+ " bananas" );
		
	}

	@Override
	protected void addIngrdients() {
		System.out.println("Adding ingredients for banana cupcake: "
				+ "\nflour ... and bananas" );
	}

	@Override
	protected void setFlavor() {
		super.cupcakeFlavor= "banana";
		
	}

	@Override
	public String serve() {
		return "Serve a banana cupcake";
	}
}
