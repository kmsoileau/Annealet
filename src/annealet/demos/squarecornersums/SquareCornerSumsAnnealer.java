package annealet.demos.squarecornersums;

import annealet.Annealet;
import annealet.demos.mathodicapetals.Ingot;

public class SquareCornerSumsAnnealer extends Annealet
{	
	public static void main(String[] args) throws Exception
	{
		new SquareCornerSumsAnnealer();
	}
		
	public SquareCornerSumsAnnealer() throws Exception
	{
		incumbent=new Ingot();
		candidate=new Ingot();
		best=new Ingot();
		
		initialTemperature(.5);
		numberOfAttemptsPerTemperature(10*20);
		coolingRate(.99);
		
		currentTemperature=initialTemperature();
		lowestEnergy=Double.POSITIVE_INFINITY;
		System.out.println("Best Utility is "+lowestEnergy);
				
		while(continueAnnealing()&&super.currentTemperature>.0001)
		{
			System.out.println("Best Utility is "+lowestEnergy);	
			best.show();
			System.out.println("Temperature is "+currentTemperature);
		}
		System.out.println("Out of Continue Loop");
	}
}



