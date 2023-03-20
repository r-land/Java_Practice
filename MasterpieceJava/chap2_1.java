
package MasterpieceJava;  
import java.util.Scanner;
public class chap2_1 {
    public static void main(String arge[]){
 Scanner sc =new Scanner(System.in);
 System.out.print("원화를 입력하세요 단위 원)>>>");
 int won = sc.nextInt();
 System.out.println(won+"원은 $"+ won/1100.0 +"입니다.");
 sc.close();
    }
    
}

