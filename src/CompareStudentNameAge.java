import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class StudentTest  {
    private String studentname;
    private int rollno;
    private int studentage;

    public String getStudentname() {
		return studentname;
	}/*
	public int getRollno() {
		return rollno;
	}*/
	public int getStudentage() {
		return studentage;
	}
	public static Comparator<StudentTest> getStuNameComparator() {
		return StuNameComparator;
	}
	
	public static Comparator<StudentTest> getStuAge() {
		return StuAge;
	}
	
	public StudentTest(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    /*Comparator for sorting the list by Student Name*/
    public static Comparator<StudentTest> StuNameComparator = new Comparator<StudentTest>() {

	public int compare(StudentTest s1, StudentTest s2) {
	   String StudentName1 = s1.getStudentname().toUpperCase();
	   String StudentName2 = s2.getStudentname().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<StudentTest> StuAge = new Comparator<StudentTest>() {

	public int compare(StudentTest s1, StudentTest s2) {

	   int age1 = s1.getStudentage();
	   int age2 = s2.getStudentage();

	   /*For ascending order*/
	   return age1-age2;

	   /*For descending order*/
	   //rollno2-rollno1;
   }};
    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

}
public class CompareStudentNameAge {
	public static void main(String args[]){
		   ArrayList<StudentTest> arraylist = new ArrayList<StudentTest>();
		   arraylist.add(new StudentTest(101, "Zues", 26));
		   arraylist.add(new StudentTest(505, "Abey", 24));
		   arraylist.add(new StudentTest(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, StudentTest.StuNameComparator);

		   for(StudentTest str: arraylist){
				System.out.println(str);
		   }

		   /* Sorting on Rollno property*/
		   System.out.println("Age Sorting:");
		   Collections.sort(arraylist, StudentTest.StuAge);
		   for(StudentTest str: arraylist){
				System.out.println(str);
		   }
		}
}
