package test2_19;

public class DivisionCalculator {
    public static void divide(int a, int b) {
        System.out.println("나눗셈 결과:" + (a / b));
    }
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("계산을 종료합니다.");
        }
    }
}
