package inlämningsuppgift1;

public abstract class Animal {
	protected String name;
	protected double weight;
;
	public Animal(){}
	public Animal(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	protected double getWeight(){
		return weight;
	}
	public String getFoodType(){
		return "animal food";
	}
	public String getName(){
		return name;
	}
}
