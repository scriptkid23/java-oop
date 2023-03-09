package DesignPattern.BridgePattern;

public class Sony implements TV {
    @Override
    public void on() {
        System.out.println("Sony specific ON");
    }

    @Override
    public void off() {
        System.out.println("Sony specific OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Setting channel Number " + channel + ".. on Sony TV");

    }

}
