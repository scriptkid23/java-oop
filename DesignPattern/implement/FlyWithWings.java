package DesignPattern.implement;

import DesignPattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
