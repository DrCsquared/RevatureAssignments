package Assignment2;

import java.io.Serializable;

public class Employee implements Serializable {
	
	
	
		@Override
	public String toString() {
		return "Employee [name: " + name + ", jobTitle: " + jobTitle + ", salary: " + salary + "]";
	}


		//private static final long serialVersionUID = 5258836872993677881L;
		private String name;
		private String jobTitle;
		private long salary;
		
		
		public Employee(String name, String jobTitle, long salary) {
			super();
			this.name = name;
			this.jobTitle = jobTitle;
			this.salary = salary;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getJobTitle() {
			return jobTitle;
		}


		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}


		public long getSalary() {
			return salary;
		}


		public void setSalary(long salary) {
			this.salary = salary;
		}
		
		
		
		
	
	

}
