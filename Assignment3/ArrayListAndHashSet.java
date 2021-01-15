package Assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListAndHashSet {
	
	public static void main(String[] args) 
	
	{
		
		ArrayList<Employee> arrayListEmployee = makeArrayList();
		HashSet<Employee> hashSetEmployee = makeHashList();
		
		Iterator<Employee> i1 = arrayListEmployee.iterator();
		Iterator<Employee> i2 = hashSetEmployee.iterator();
		
		System.out.println("Array List iterator print");
		 while (i1.hasNext()) 
		        System.out.println(i1.next());
		 
		 System.out.println("Hash Set iterator print");
		 while (i2.hasNext()) 
		        System.out.println(i2.next());
		 
		}
		
		
		
			
	
	
	public static ArrayList<Employee> makeArrayList() 
	{
			ArrayList<Employee> arrayListEmployee = new ArrayList<Employee>();
			
			Employee e1 = new Employee(1, "Colin");
			Employee e2 = new Employee(2, "Matt");
			Employee e3 = new Employee(3, "Steve");
			
			arrayListEmployee.add(e1);
			arrayListEmployee.add(e2);
			arrayListEmployee.add(e3);
			
			return arrayListEmployee;
	}
	
	public static HashSet<Employee> makeHashList() 
	{
		HashSet<Employee> hashSetEmployee = new HashSet<Employee>();
		
		Employee e1 = new Employee(1, "Jim");
		Employee e2 = new Employee(2, "James");
		Employee e3 = new Employee(3, "Chirs");
		
		hashSetEmployee.add(e1);
		hashSetEmployee.add(e2);
		hashSetEmployee.add(e3);
		
		return hashSetEmployee;
	}

}
