package MasterpieceJava;  
import java.util.Scanner;

public class chap2_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리수 정수 입력(10~99 >>");
        int i =Sc.nextInt();
        if(i/10 == i%10)
        System.out.println("Yes!10의 자리와 1의 자리가 같습니다.");
        sc.close();
    }
    
}
