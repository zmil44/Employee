/*
 * Zach Miller
 */
public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.SetFirstName("Zach");
		e1.SetLastName("Miller");
		e1.SetSalary(100000);
		
		Employee e2 = new Employee();
		e2.SetFirstName("John");
		e2.SetLastName("Doe");
		e2.SetSalary(82000.54);
		
		System.out.printf("Salary for %s %s is $%.2f\n",e1.GetFirstName(),e1.GetLastName(),e1.GetSalary());
		System.out.printf("Salary for %s %s is $%.2f\n",e2.GetFirstName(),e2.GetLastName(),e2.GetSalary());
		
		double sal_e1=e1.GetSalary();
		double sal_e2=e2.GetSalary();
		e1.SetSalary(sal_e1*.1+sal_e1);
		e2.SetSalary(sal_e2*.1+sal_e2);
		System.out.printf("New salary for %s %s is $%.2f\n",e1.GetFirstName(),e1.GetLastName(),e1.GetSalary());
		System.out.printf("New salary for %s %s is $%.2f\n",e2.GetFirstName(),e2.GetLastName(),e2.GetSalary());
	}

}
