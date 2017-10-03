package inlämningsuppgift1;

public class Snake extends Animal implements IFood{
	public Snake(String name, double weight){
		super(name, weight);
	}
	protected static double foodAmount = 20.0;		//Statisk variabel då ALLA ormar ska ha 20g ormpellets.
	@Override
	public double calculateFood(){					//Polymorfism
		return foodAmount;
	}
	@Override
	public String getFoodType(){					//Polymorfism
		return "snake food";
	}
}
