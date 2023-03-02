package Duck;

import DesignPattern.implement.Quack;
import Duck.Implements.FlyWithWings;

public class VitGia extends Duck {
   @Override
   void display() {
       flyBehavior.fly();
       quackBehavior.quack();
   }

   public static void main(String[] args) {
    VitGia vitGia = new VitGia();
    vitGia.setFlyBehavior(new FlyWithWings());
    vitGia.setQuackBehavior(new Quack());
    vitGia.display();
   }
}
