package dessert;

public abstract class CupcakeTemplate implements Cloneable{
	protected double flour;
	protected int eggs;
	protected double milk;
	protected double sugar;
	protected double butter;
	protected double bakingPowder;
	protected int time;
	protected String cupcakeFlavor;


	public CupcakeTemplate(double flour, int eggs, double milk, double sugar, double butter, double bakingPowder, int cookTime) {
		this.bakingPowder= bakingPowder;
		this.butter= butter;
		this.eggs= eggs;
		this.flour= flour;
		this.milk= milk;
		this.sugar= sugar;	
		time= cookTime;
		setFlavor();
	}

	protected abstract void setFlavor();
	protected abstract void putInOven();
	protected abstract void measureingredients();
	protected abstract void addIngrdients();
	public abstract String serve(); 
	
	protected void mix() {
		measureingredients();
		addIngrdients();
		System.out.println("Mixing ingredients");
	}

	protected void prepare() {
		mix();
		putInOven();
		System.out.println("The cupcake is ready\n");
	}


	@Override
	public Object clone() 
	{ 
		Object clone = null; 
		try 
		{ 
			clone = super.clone(); 
		}  
		catch (CloneNotSupportedException e)  
		{ 
			e.printStackTrace(); 
		} 
		return clone; 
	} 
	
	

}
