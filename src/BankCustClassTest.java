import java.util.Enumeration;
import java.util.Hashtable;

public class BankCustClassTest {
	public static void main(String args[]) {
		BankCustomer b1 = new BankCustomer("mac", "9999999999", 102030);
		BankCustomer b2 = new BankCustomer("deep", "9999999999", 102030);
		BankCustomer b3 = new BankCustomer("paro", "9999999999", 102030);
		BankCustomer b4 = new BankCustomer("sri", "9999999999", 102030);
		BankCustomer b5 = new BankCustomer("mita", "9999999999", 102030);
		Hashtable<Integer, BankCustomer> hs = new Hashtable<>();
		hs.put(101, b1);
		hs.put(102, b2);
		hs.put(103, b3);
		hs.put(104, b4);
		hs.put(105, b5);
		Enumeration<Integer> e = hs.keys();
		System.out.println(hs.get(101));
		int k;
		BankCustomer va;
		while(e.hasMoreElements())
		{
			k = e.nextElement();
			va = hs.get(k);
			System.out.println(k+"  "+va);
		}
	}
}
