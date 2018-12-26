import java.util.*;
public class StudentSortByNameTest {
        public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
    String n;
    LinkedHashSet<String> ts=new LinkedHashSet<String>();
    for(int i=0; i<=4; i++)
    {
        System.out.println("Enter name");
        n=sc.next();
        
    ts.add(n);
    
    }
    
    for(String s : ts )
    {
    System.out.println(s);
    }
   TreeSet<String> t= new TreeSet<String>();
   t.addAll(ts);
    for(String s : t )
        
    {
    System.out.println(s);
    } 
   sc.close();
    
    }
}
