package day5;

/**
 * InnerInterfaceExample
 */

interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {
}

 class Owl implements HasBigEyes {
   
}

abstract class AbtractExampleDemp {
}

abstract interface InnerInterfaceExample {
    public abstract Float getSpeed();

    int MAX = 2;
}

class Demo implements InnerInterfaceExample {
    @Override
    public Float getSpeed() {
        System.out.println(InnerInterfaceExample.MAX);
        // TODO Auto-generated method stub
        return null;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        var demo = new Demo();
        demo.getSpeed();
    }
}
