package MasterpieceJava.ch4;

public class Regular extends Employee {
    public Regular(String name, int age, String add, String part) {
        super(name,age,add,part);
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("이 직원은 정규직 직원입니다.");
        System.out.println( "이 직원의 월 급여는" + this.salary + "원 입니다.");
    }
}
