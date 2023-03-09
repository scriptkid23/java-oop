package Duck.Implements;

import DesignPattern.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Mute Quack...");
    }
}
