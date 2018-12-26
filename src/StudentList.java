
public class StudentList {
	String name;
	float marks;
	@Override
	public String toString() {
		return "StudentList [name=" + name + ", marks=" + marks + "]";
	}
	public StudentList(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public StudentList() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
}