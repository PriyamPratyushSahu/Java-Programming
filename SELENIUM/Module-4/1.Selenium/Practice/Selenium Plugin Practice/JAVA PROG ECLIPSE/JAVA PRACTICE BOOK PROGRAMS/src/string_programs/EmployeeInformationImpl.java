package string_programs;

public class EmployeeInformationImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmployeeImplementation employeeImplementation=new EmployeeImplementation();
		//employeeImplementation.getEmployeeInfo("Amit Rai@1PC16CS046-ALU#8");
		Employee e=new Employee();
		//System.out.println(employeeImplementation.getEmployeeInfo("Amit Rai@1PC16CS046-ALU#8"));
		//Employee ep = new Employee();
		EmployeeImplementation ei = new EmployeeImplementation();
		
		ep = ei.getEmployeeInfo("Rakesh RaJ@1PC16CS046-SDE#8");
		System.out.println("Employee department: "+ ei.getEmployeeDept(ep));
	}

}
