package DesignPattern;

import DesignPattern.implement.FlyNoWay;
import DesignPattern.implement.MuteQuack;


public class CrubberDuck extends Duck{
    
    CrubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    public static void main(String[] args) {
        var crubberDuck = new CrubberDuck();
        crubberDuck.performFly();
        crubberDuck.performQuack();        
    }
}
