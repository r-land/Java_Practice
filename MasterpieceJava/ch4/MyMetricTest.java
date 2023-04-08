package MasterpieceJava.ch4;
class MyMetric {
    private static double distance;
    public static double kiloTOMile(double d){
        distance = d/1.6093;
        return distance;
        
    }
    public static void mileToKilo(double d){
        distance = d*1.6093;
    }
}
public class MyMetricTest {
    public static void main(String args[]) {
        double d = MyMetric.kiloTOMile(1);
        System.out.println(d);
        
    }
    
}
