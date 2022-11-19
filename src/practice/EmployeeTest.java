	package practice;

import java.util.Scanner;

class Employee {

	int Eid;
	String name;
	int salary;

	Scanner sc = new Scanner(System.in);

	void getData() {

		System.out.print("Enter the Eid,name, Salary:");

		Eid = sc.nextInt();
		name = sc.next();
		salary = sc.nextInt();

	}

	void show() {

		System.out.println(Eid + " " + name + " " + salary);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		
	Employee []obj;
	obj=new Employee[5];
		for (int i = 0; i < 5; i++) {
			obj[i]=new Employee();	
			obj[i].getData();
		}
		for (int i = 0; i < 5; i++) {
			obj[i].show();
			
		}

	}

}
