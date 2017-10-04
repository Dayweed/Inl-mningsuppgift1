package inlämningsuppgift1;

public class Mammal extends Animal implements IFood{	
	public Mammal(String name, double weight){
		super(name, weight);
	}
	@Override
	public double calculateFood(){						//Metoden ändras i subklassen Cat men inte i subklassen Dog. Dynamisk bindning.
		return super.getWeight()/100;
	}
}
