package employeeDao;

import java.util.Scanner;

import employee.EmployeeException;

public class UseCase {
	public static void main(String[] args) {
		EmployeeDao dao=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 to get all empoyee details");
		System.out.println("enter 2 to get  employee by address");
		System.out.println("enter 3 to get  employee name and salary");
		System.out.println("enter 4 to get  get employee by salary range");
		System.out.println("enter 5 to get  get empoyee salary");
		int n=sc.nextInt();
		switch (n) {
		case 1:
			try {
				
				System.out.println(dao.getAllEmployee());
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			break;
		case 2:
			System.out.println("please enter address");
			
			try {
				
				System.out.println(dao.getEmployeeByAddress(sc.next()));
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println(" enter employee id");
			try {
				System.out.println(dao.getEmployeeNameAndSalary(sc.nextInt()));
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			System.out.println("please enter start salary");
			int s1=sc.nextInt();
			System.out.println("please enter end salary");
			int s2=sc.nextInt();
			
			try {
				System.out.println(dao.getEmployeeRangeSalary(s1,s2));
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			break;
		case 5:
			System.out.println("please enter emplId");
			try {
				System.out.println(dao.getEmployeeSalary(sc.nextInt()));
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("wrong input");
			break;
		}
	}
}
