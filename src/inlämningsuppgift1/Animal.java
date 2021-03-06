package inlämningsuppgift1;

public abstract class Animal {
	private String name;						//Inkapslad.
	private double weight;						//Inkapslad.
;
	public Animal(){}
	public Animal(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public String getFoodType(){
		return "animal food";
	}
	public String getName(){					//Dynamisk, när objekt av Cat, Dog och Snake kallar på metoden så nås den i superklassen Animal.
		return name;							//Inkapslad.
	}
}