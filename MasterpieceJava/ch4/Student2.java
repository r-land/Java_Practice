package MasterpieceJava.ch4;

public class Student2 {
    String dept;
    int sNum;

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSNum() {
        return this.sNum;
    }

    public void setSNum(int sNum) {
        this.sNum = sNum;
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setDept("전산과학과");
        s.setSNum(2013_4568);
        System.out.println(s.getDept()+ " " + s.getSNum());

        
    }
    }

