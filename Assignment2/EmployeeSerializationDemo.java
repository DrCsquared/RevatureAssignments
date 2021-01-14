package Assignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EmployeeSerializationDemo {
	
	public static void main(String[] args) 
	
	{
	try 
	{
		Employee employee1 = new Employee("Colin Cumberland", "PEGA Developer", 70000);
		Employee employee2 = new Employee("Chris Murphy", "PEGA Developer", 70000);
		Employee employee3 = new Employee("Steve Woz", "Senior PEGA Developer", 120000);
		System.out.println("Employee1: " + employee1.toString());
		System.out.println("Employee2: " + employee2.toString());
		System.out.println("Employee3: " + employee3.toString());
		
		FileOutputStream fos = new FileOutputStream("employeeData.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee1);
		oos.writeObject(employee2);
		oos.writeObject(employee3);
		oos.flush();
		oos.close();
		
		
		
	}catch(Exception e) 
	{
		
		System.out.println("Exception during serialization: " + e);
		System.exit(0);
	}
	
	try {
		
		Employee employee4;
		Employee employee5;
		Employee employee6;
		
		FileInputStream fis = new FileInputStream("employeeData.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		employee4 = (Employee)ois.readObject();
		employee5 = (Employee)ois.readObject();
		employee6 = (Employee)ois.readObject();
		
		ois.close();
		System.out.println("employee4: " + employee4.toString());
		System.out.println("employee5: " + employee5.toString());
		System.out.println("employee6: " + employee6.toString());
		
	}catch(Exception e) 
	{
		
		System.out.println("Exception during serialization: " + e);
		System.exit(0);
	}
	}

}
