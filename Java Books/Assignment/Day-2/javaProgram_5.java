/*
 Define a class named "Employee" with the following fields:
	  empID , empName , deptID , bloodGroup , salary.
      Declare and define following methods :
           setEmployeeDetails( ),  printEmployeeDetails( )
      Prompt the user to enter values.
**/

import java.io.*;
class Employee
{
    int empID,deptID;
    String empName,bloodGroup;
    double salary;

    void setEmployeeDetails()throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee's Details: ");
        System.out.println("Enter Employee's ID: ");
        empID = Integer.parseInt(pp.readLine());
        System.out.println("Enter Employee's name: ");
        empName = pp.readLine();
        System.out.println("Enter Employee's Department ID: ");
        deptID = Integer.parseInt(pp.readLine());
        System.out.println("Enter Employee's Blood Group: ");
        bloodGroup = pp.readLine();
        System.out.println("Enter Employee's Salary: ");
        salary = Double.parseDouble(pp.readLine());
    }

    void printEmployeeDetails()
    {
        System.out.println("Employee's Details are:");
        System.out.println("Employee's ID: " + empID);
        System.out.println("Employee's Name: " + empName);
        System.out.println("Employee's Department ID: " + deptID);
        System.out.println("Employee's Blood Group: " + bloodGroup);
        System.out.println("Employee's Salary: " + salary);
    }    
}

class javaProgram_5
    {
        public static void main(String args[])throws IOException
        {
            Employee emp = new Employee();
            emp.setEmployeeDetails();
            emp.printEmployeeDetails();            
        }
    }