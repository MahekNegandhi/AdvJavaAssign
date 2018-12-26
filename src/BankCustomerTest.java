import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class BankCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String , String> ht = new Hashtable<String , String>();
		Scanner sc = new Scanner(System.in);
		String name = "" , acc_no = "";
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter name - ");
			name = sc.next();
			System.out.println("Enter acc no.");
			acc_no = sc.next();
			ht.put(acc_no,name);
		}
		
		System.out.println("Size -- "+ht.size());
		sc.close();
		String va,k;
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements())
		{
			k = e.nextElement();
			va = ht.get(k);
			System.out.println(k+"  "+va);
		}
	}

}
