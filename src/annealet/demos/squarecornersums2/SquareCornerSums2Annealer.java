package annealet.demos.squarecornersums2;

import annealet.Annealet;
import annealet.demos.squarecornersums2.Ingot;

public class SquareCornerSums2Annealer extends Annealet
{	
	public static void main(String[] args) throws Exception
	{
		new SquareCornerSums2Annealer();
	}
		
	public SquareCornerSums2Annealer() throws Exception
	{
		incumbent=new Ingot();
		candidate=new Ingot();
		best=new Ingot();
		
		initialTemperature(100.0);
		numberOfAttemptsPerTemperature(10*20);
		coolingRate(.99);
		
		currentTemperature=initialTemperature();
		lowestEnergy=1E+20;
		System.out.println("Best Utility is "+lowestEnergy);
				
		while(continueAnnealing()&&super.currentTemperature>.001)
		{
			System.out.println("Best Utility is "+lowestEnergy);	
			best.show();
			System.out.println("Temperature is "+currentTemperature);
		}
		System.out.println("Out of Continue Loop");
	}
}



