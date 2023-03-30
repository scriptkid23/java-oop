package DesignPattern.MVCPattern;

public class MVCJavaPatternExample {
    
    public static void main(String[] args) {
        var controller = new Controller();
        controller.createEmployee(0, "123");
        controller.createEmployee(1, "123");
        controller.createEmployee(2, "123");
        controller.createEmployee(3, "123");

        controller.display();
    }
    
}
