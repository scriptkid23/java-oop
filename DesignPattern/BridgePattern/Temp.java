package DesignPattern.BridgePattern;


public class Sony implements TV {
    @Override
    void on() {
        System.out.println("Sony specific ON");
    }

    @Override
    void off() {
        System.out.println("Sony specific OFF");
    }

    @Override
    void tuneChannel(int channel) {
        System.out.println("Setting channel Number " + channel + ".. on Sony TV");

    }

}

public class Temp {
    
}
