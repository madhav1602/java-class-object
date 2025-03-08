import java.util.*;
public class EmployeeDetails {
    // create method for employee name
    public String employeeName(String name){
        return name;
    }

    // create method for employee id
    public int employeeID(int id){
        return id;
    }

    // create method for employee salary
    public double employeeSalary(double salary){
        return salary;
    }

    // create method to display details
    public void displayDetails(String name, int id, double salary){
        System.out.println("Name: " + employeeName(name));
        System.out.println("Id: "+ employeeID(id));
        System.out.println("Salary(INR): "+ employeeSalary(salary));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee: ");
        String name=sc.next();
        System.out.println("Enter ID of employee: ");
        int id=sc.nextInt();
        System.out.println("Enter salary of employee: ");
        double salary=sc.nextDouble();

        //Create object for class and call method
        EmployeeDetails emp=new EmployeeDetails();
        emp.displayDetails(name,id,salary);
    }
}
