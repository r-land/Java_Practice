public class FloatEx {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf(" 123456789012345678901234%n");
        System.out.printf("f    : %f%n",f); //소수점이하 6자리까지 출력
        System.out.printf("f    : %24.20f%n",f); //24자리 중 20자리는 소수점 이하수 출력
        System.out.printf("f2    : %24.20f%n",f2);
        System.out.printf("d    : %24.20f%n",d);
    }
}
