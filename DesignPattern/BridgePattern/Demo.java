package DesignPattern.BridgePattern;

/**
 * Demo
 */
public class Demo {
    enum Falvor{
        VALINA, demo, temp
        static final Falvor Default = temp;
    }
    Demo(){
        System.out.println("123");
    }

    public void temp() {
        this();
    }
}