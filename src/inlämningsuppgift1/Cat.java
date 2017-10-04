package inlämningsuppgift1;

public class Cat extends Mammal{
	public Cat(String name, double weight){
		super(name, weight);
	}
	@Override
	public double calculateFood(){					//Dynamsik bindning.
		return super.getWeight()/150;
	}
	@Override
	public String getFoodType(){					//Polymorfism.
		return "cat food";
	}
}
