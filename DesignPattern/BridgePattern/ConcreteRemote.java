package DesignPattern.BridgePattern;

public class ConcreteRemote extends RemoteControl {

    private int currentStation;

    ConcreteRemote(TV imTv) {
        super(imTv);
    }

    public void nextChannel() {
        currentStation++;
        setChannel(currentStation);
    }

    public void prevChannel() {
        currentStation--;
        setChannel(currentStation);
    }
}
