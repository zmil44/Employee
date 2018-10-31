
public class Employee {
	private String firstName,lastName;
	private double salary;
	
	public Employee()
	{
		firstName="";
		lastName="";
		salary=0.0;
		
	}
	public void SetFirstName(String first_Name)
	{
		firstName=first_Name;
	}
	
	public String GetFirstName()
	{
		return firstName;
	}
	
	public void SetLastName(String last_Name)
	{
		lastName=last_Name;
	}
	
	public String GetLastName()
	{
		return lastName;
	}
	
	public boolean SetSalary(double sal)
	{
		boolean valid=true;
		if(sal<0)
		{
			System.out.println("Not a valid salary");
			valid=false;
		}
		else
			salary=sal;
		return valid;
	}
	
	public double GetSalary()
	{
		return salary;
	}
}
