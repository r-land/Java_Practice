package MasterpieceJava.ch4;

public class Student {
    String dept;
    int sNum;

    public static void main(String[] args) {
        Student s = new Student();
        s.dept ="전산과학과";
        s.sNum = 2013_4568;
        System.out.println(s.dept+ " "+ s.sNum);
        
        
    }
}
