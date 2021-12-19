package assignment3_inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("Adil", 40000, 2013, "asd12e3ddd");
		System.out.println("data "+employee.getName() +" "+ employee.getAnnualSalary()+" "+employee.getYearOfJoining()+" "+employee.getNationalInsuranceNo());

	}

}
