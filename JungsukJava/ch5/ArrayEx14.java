package JungsukJava.ch5;

public class ArrayEx14 {
    public static void main(String[] args) {
        
    
    String src = "ABCDE";
    
    for(int i=0; i < src.length(); i++){
        char ch = src.charAt(i); //i번째 문자를 ch에 저장
        System.out.println("src.charAt("+i+"):"+ch);
    } 
    char[] chArr = src.toCharArray();  //string 을 char[]로 변환
  System.out.println(chArr);  //char배열 (char[])출력  
} 
}
