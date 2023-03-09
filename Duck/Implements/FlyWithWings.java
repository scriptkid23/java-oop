package Duck.Implements;

import DesignPattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly Fly....");
    }
}
