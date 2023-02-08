package day04;

public class LocalClassExample {
    public void calculate() {
        final int number = 100;
        class Calculator {
            public void multiply() {
                System.out.println(number * 3.14f);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var localClassExample = new LocalClassExample();
        localClassExample.calculate();
    }
}
