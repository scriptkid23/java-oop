package DesignPattern.BridgePattern;

public class RCA implements TV {
    @Override
    public void on() {
        System.out.println("RCA specific ON");
    }

    @Override
    public void off() {
        System.out.println("RCA specific OFF");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("Setting channel Number " + channel + ".. on RCA TV");

    }

}
