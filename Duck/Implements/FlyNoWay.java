package Duck.Implements;

import DesignPattern.behavior.FlyBehavior;

public class FlyNoWay  implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyNoWay...");
    }
}
