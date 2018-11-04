package annealet.demos.mathodicapetals;

import annealet.Annealet;
import annealet.demos.mathodicapetals.Ingot;

public class MathodicaPetalAnnealet extends Annealet
{	
	public static void main(String[] args) throws Exception
	{
		new MathodicaPetalAnnealet();
	}
		
	public MathodicaPetalAnnealet() throws Exception
	{
		incumbent=new Ingot();
		candidate=new Ingot();
		best=new Ingot();
		
		coolingRate(0.9999);
		initialTemperature(20000);
		numberOfAttemptsPerTemperature(100);
		
		currentTemperature=initialTemperature();
		lowestEnergy=Integer.MAX_VALUE;
				
		while(continueAnnealing()&&super.currentTemperature>.001)
		{
			System.out.println("\nLowest energy is "+Double.toString(lowestEnergy));	
			best.show();
			System.out.println("");
			System.out.println("Temperature is "+currentTemperature);
		}
		System.out.println("Out of Continue Loop");
	}
}



