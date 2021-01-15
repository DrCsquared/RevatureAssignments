package Assignment3;

public class Employee {
	
	private int iD;
	private String name;
	
	
	
	public int getiD() {
		return iD;
	}



	public void setiD(int iD) {
		this.iD = iD;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employee() {
		super();
	}



	public Employee(int iD, String name) {
		super();
		this.iD = iD;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [iD: " + iD + ", name: " + name + "]";
	}
	
	

}
