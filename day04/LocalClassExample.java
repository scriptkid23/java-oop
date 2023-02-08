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
    /*
     * 
     * Why Can Local Classes Only Access final or Effectively Final Variables?
     * 
     *   The compiler generates a separate .class file for each inner class. 
     *   A separate class has no way to refer to a local variable. However, if the local variable
     *   is final or effectively final, Java can handle it by passing a copy of the value or reference
     *   variable to the constructor of the local class. If it weren’t final or effectively final, these
     *   tricks wouldn’t work because the value could change after the copy was made.
     */
}
