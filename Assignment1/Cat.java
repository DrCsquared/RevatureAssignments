package Assignment1;

public class Cat extends Feline{
	
	public String PICTURE = "";
	public String FOOD = "";
	public int HUNGER = 0;
	public String BOUNDARIES = "";
	public String LOCATION = "";

	@Override
	public void makeNoise() {
		
		System.out.println("Meow.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating from a bowl.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping in a cat bed.");
	}

	@Override
	public void roam() {
		
		System.out.println("Cat is running around in the house.");
		// TODO Auto-generated method stub
		
	}

}
