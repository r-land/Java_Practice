package MasterpieceJava.ch4;

public class Employee {
    String name;
    int age;
    String address;
    String part;
    long salary;
    public Employee(String name, int age, String add, String part){
        this.name =name;
        this.age = age;
        this.address = add;
        this.part = part;
    }
    public void printInfo(){
        System.out.println("이름 :"+this.name+ ", 나이 :"+ this.age);
        System.out.println("주소 :"+this.address+ ", 부서 :"+ this.part);
    }
}
