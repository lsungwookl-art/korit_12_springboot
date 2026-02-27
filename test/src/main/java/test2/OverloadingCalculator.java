package test2_14;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int intResult = calc.add(5, 10);
        System.out.println("정수 덧셈 결과:" + intResult);
        double doubleResult = calc.add(3.5, 2.5);
        System.out.println("실수 덧셈 결과:" + doubleResult);
    }
}
