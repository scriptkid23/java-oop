package DesignPattern.implement;

import DesignPattern.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm not fly...");
    }
}
