import java.util.HashSet;

public class HashSetStudentTest {

	public static void main(String[] args) {
		/*HashSetStudent hs[] = new HashSetStudent[4];
		hs[0] = new HashSetStudent("mac", 1, 20);
		hs[1] = new HashSetStudent("Riri", 2, 25);
		hs[2] = new HashSetStudent("katy", 3, 26);
		hs[3] = new HashSetStudent("mac", 1, 20);*/
		HashSet<HashSetStudent> lhm = new HashSet<HashSetStudent>();
        lhm.add(new HashSetStudent("mac", 1, 20));
        lhm.add(new HashSetStudent("riri", 1, 20));
        lhm.add(new HashSetStudent("katy", 1, 20));
        for(HashSetStudent hs:lhm){
            System.out.println(hs);
        }
        HashSetStudent duplicate = new HashSetStudent("mac", 1, 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for(HashSetStudent s:lhm){
            System.out.println(s);
        }
		/*for (int i = 3; i < 6; i++) {
			hs[i] = new HashSetStudent("taylor", 4, 23);
		}
		for (int i = 6; i <= 9; i++) {
			hs[i] = new HashSetStudent("Salena", 5, 22);
		}*/
		/*HashSet<HashSetStudent> h = new HashSet<>();
		for (int i = 0; i < hs.length; i++) {
			h.add(hs[i]);
		}
		System.out.println("Student hashset is -- \n"+h);*/
	}

}
