
public class HashSetStudent {
	String name;
	int roll;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public HashSetStudent() {
		super();
	}
	public HashSetStudent(String name, int roll, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", age=" + age + "]";
	}
}
