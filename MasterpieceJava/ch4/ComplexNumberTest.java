package MasterpieceJava.ch4;

class ComplexNumber{
int real;
int imag;
void print(){
    System.out.println(real+ "+ i" + imag);
}

}
public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber c;
        c= new ComplexNumber();
        c.real = 10;
        c.imag = 20;
        c.print();
        
    }
    
}
