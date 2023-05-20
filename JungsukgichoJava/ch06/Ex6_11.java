package JungsukgichoJava.ch06;
class Data_1{
    int value;
}
class Data_2{
    int value;

    Data_2(int x){
        value = x;
    }
}
class Ex6_11 {
    public static void main(String[] args) {
        new Data_1();
        new Data_2(10);
        
        System.out.print("d2,d1");
    }    
}
