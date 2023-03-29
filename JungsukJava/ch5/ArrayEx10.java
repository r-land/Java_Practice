package JungsukJava.ch5;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        
        for (int i=0; i<numArr.length ; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i =0; i<numArr.length-1; i++){
            boolean changed = false;  //자리바꿈체크

         for(int j =0; j < numArr.length-1-i; j++){
            if(numArr[j] > numArr[j+1]) {   //자리바꿈 알고리즘
                int temp = numArr[j];
                numArr[j] = numArr[j+1];
                numArr[j+1] = temp;
                changed = true;   //자리바꿈 true
            }
         }   // j for문 종료

         if(!changed) break; 

         for(int k =0; k<numArr.length;k++)
         System.out.print(numArr[k]); //정렬 결과 출력
         System.out.println();
        } // i for문 종료
    }
}
