package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5, b = 2;

        int sum = a + b;
        System.out.println("a + b ="+sum);

        int diff = a - b;
        System.out.println("a - b ="+diff);

        int multi = a * b;
        System.out.println("a * b ="+multi);

        //int는 정수라 소수점은 생략되고 출력
        int div = a / b;
        System.out.println("a / b ="+div);

        double div2 = (double) a / b;
        System.out.println("a / b ="+div2);

        //나머지
        int mod = a % b;
        System.out.println("a % b ="+mod);

        //int z = 10 / 0;
        //자바에서는 0으로 값을 나누면 프로그램 오류 발생
    }
}
