package string_programs;

public class EmployeeImplementation {
	public Employee getEmployeeInfo(String str)
	{
		String[] arr = str.split("@");
		String name=arr[0];
		String[] arr2 = arr[1].split("-");
		String ssn=arr2[0];
		String[] arr3 = arr2[1].split("#");
		String dept=arr3[0];
		int salary=Integer.valueOf(arr[1]);
		Employee e=new Employee(name,ssn,dept,salary);
		return e;
	}
	public String getEmployeeDept(Employee e)
	{
		String d=e.ssn.substring(e.ssn.length() - 3);
		int dept=Integer.valueOf(d);
		if(dept>001 && dept<060 )
			return "L1";
		else if(dept>061 && dept<120)
			return "L2";
		else if(dept>121 && dept<180)
			return "L3";
		else
			return "L4";
	}
}
