package Assignment1;

public class Dog extends Canine {
	
	public String PICTURE = "";
	public String FOOD = "";
	public int HUNGER = 0;
	public String BOUNDARIES = "";
	public String LOCATION = "";
	
	@Override
	public void makeNoise() {
		
		System.out.println("Barks");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		
		System.out.println("Dog is eating from a bowl.");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sleep() {
		
		System.out.println("Dog is sleeping in a dog bed.");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void roam() {
		
		System.out.println("Dog is running around in the back yard.");
		// TODO Auto-generated method stub
		
	}
	
	

}
