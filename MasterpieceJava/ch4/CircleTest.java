package MasterpieceJava.ch4;

    class Circle{
        double r;
        double cx;
        double cy;

        public Circle(double d) {
        }
        public double area(){
            return 3.141592*r*r;
        }
        public double getR(){
            return r;
        }
        public void setR(double r){
            this.r = r;
        }
        public double getCx(){
            return cx;
        }
        public void setCx(double cx){
            this.cx = cx;
        }
        public double getCy() {
            return cy;
        }
        public void setCy(double cy){
            this.cy = cy;
        }
        public double getArea() {
            return 0;
        }
    }
    

    public class CircleTest {
        public static void main(String[] args) {
            Circle c = new Circle();
            c.setR(10.0);
            System.out.println(c.area());

            
        
        
    }

}
