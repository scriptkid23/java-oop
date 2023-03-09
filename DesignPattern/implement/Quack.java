package DesignPattern.implement;

import DesignPattern.behavior.QuackBehavior;

/**
 * Quack
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

}