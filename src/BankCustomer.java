
public class BankCustomer {
	private String name;
	private String no;
	private int balance;
	public BankCustomer(String name, String no, int balance) {
		super();
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankCustomer [name=" + name + ", no=" + no + ", balance=" + balance + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public BankCustomer() {
		super();
	}
	
}
