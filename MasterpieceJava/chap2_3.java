package MasterpieceJava;

import java.util.Scanner;

public class chap2_3 {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
System.out.println("금액을 입력하시오>>");
int price = sc.nextInt();

if(price/50000>0){
    System.out.println("오만원권"+price/50000+"매");
    price%=50000;
}
if(price/10000>0){
    System.out.println("만원권"+price/10000+"매");
    price%=10000;
}
if(price/1000>0){
    System.out.println("천원권"+price/1000+"매");
    price%=1000;
}
if(price/100>0){
    System.out.println("백원"+price/100+"개");
    price%=100;
}
if(price/50>0){
    System.out.println("오십원"+price/50+"개");
    price%=50;
}
if(price/10>0){
    System.out.println("십원"+price/10+"개");
    price%=10;
}
if(price>0){
    System.out.println("일원"+price+"개");
   
}
sc.close();
}
}
