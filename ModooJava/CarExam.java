package ModooJava;


class SuperCar{
    public void run(){
        System.out.println("차가 달립니다.");
    }
}

public class CarExam {
    public static void main(String[] args) {
        SuperCar car = new SuperCar();
        car.run();
    }
}
