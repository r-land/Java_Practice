package JungsukJava.ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i =0; i <arr.length; i++)
        arr[i]= i+1;

        System.out.println("[변경전]");
        System.out.println("arr.length:"+arr.length);
        for(int i =0; i<arr.length;i++)
        System.out.println("arr["+i+"]:"+arr[i]);

        int[] tmp = new int[arr.length*2];
        for(int i = 0; i<arr.length; i++)
        tmp[i] = arr[i]; //배열 arr 값을 tmp 배열에 복사
        arr =tmp; // tmp 값을 arr 저장

        System.out.println("[변경후]");
        System.out.println("arr.length:"+arr.length);
        for(int i =0; i<arr.length;i++)
        System.out.println("arr["+i+"]:"+arr[i]);
    }
}
