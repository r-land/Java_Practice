package MasterpieceJava.ch4;

public class SalaryMan {
    int salary = 1000000;

    public SalaryMan(){

    }
    public SalaryMan(int salary){
        this.salary = salary;
    }
    int getAnnualGross(){
        return salary*12 + salary*5;
    }
    public static void main(String[] args) {
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2000000).getAnnualGross());
        
    }
}
