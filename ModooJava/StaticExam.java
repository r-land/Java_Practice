package ModooJava;

class car{
    static int wheelCount;
    int speed;
}
public class StaticExam {
    public static void main(String [] args) {
        car taxi = new car();
        car suv = new car();

        taxi.wheelCount = 10;
        suv.wheelCount = 4;

        System.out.println("taxi의 바퀴 수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴 수:"+ suv.wheelCount);
    }
}
