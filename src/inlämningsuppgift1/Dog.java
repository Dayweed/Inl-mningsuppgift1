package inlämningsuppgift1;

public class Dog extends Mammal{					//Metoden calculateFood ligger i superklassen Mammal.
	public Dog(String name, double weight){
		super(name, weight);
	}
	@Override
	public String getFoodType(){					//Polymorfism
		return "dog food";
	}
}
