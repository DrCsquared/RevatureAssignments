package Assignment1;

public abstract class Canine implements Animal {
	
	public String PICTURE = "";
	public String FOOD = "";
	public int HUNGER = 0;
	public String BOUNDARIES = "";
	public String LOCATION = "";
	
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void sleep();
	public abstract void roam();

}
