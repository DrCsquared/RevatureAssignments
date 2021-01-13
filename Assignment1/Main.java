package Assignment1;

public class Main {
	
	public static void main(String[] args) 
	{
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.eat();
		a1.roam();
		a1.makeNoise();
		a1.sleep();
		
		a2.eat();
		a2.roam();
		a2.makeNoise();
		a2.sleep();
	}

}
