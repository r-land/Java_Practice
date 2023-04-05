package MasterpieceJava.ch4;

class Rectangle{
    int w;
    int h;
    int area(){return w*h;}
    int perimeter(){return 2*(w+h);}
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect = new Rectangle();
        myRect.w = 10;
        myRect.h =20;
        System.out.println("면적은" + myRect.area());
        

    }}
