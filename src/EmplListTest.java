import java.util.ArrayList;
import java.util.Scanner;

/*create an Employee class with properties
 *  EmpployeeCode , name , salary , designation 
 create contructor and show methods . 
 Create an employee list through user input for 10 employees 
 and print data of all employees through iterator. 
  Also, increase salary of all employees by 10%. 
*/


public class EmplListTest {
	public static void main(String[] args) {
	EmployeeBean emp1 = new EmployeeBean(1,"a",100,"manager");
		ArrayList<EmployeeBean> ar = new ArrayList<EmployeeBean>();
		ar.add(emp1);
		int ecode;
		String name;
		int sal;
		String desig;
		EmployeeBean e;
		//new EmployeeBean(employeeCode, name, salary, designation)
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter name - ");
			name = sc.next();
			System.out.println("Enter code - ");
			ecode = sc.nextInt();
			System.out.println("Enter slaary - ");
			sal = sc.nextInt();
			System.out.println("Enter designation - ");
			desig = sc.next();
			e = new EmployeeBean(ecode, name, sal, desig);
			ar.add(e);
		}
		System.out.println(ar);
		for (int i = 0; i < 3; i++) {
			//e.setSalary(e.getSalary()*1);
		}
		System.out.println(ar);
		sc.close();
	}

}