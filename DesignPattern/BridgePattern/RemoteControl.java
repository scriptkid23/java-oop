package DesignPattern.BridgePattern;

public abstract class RemoteControl {
    private TV implementor;

    RemoteControl(TV imTv) {
        this.implementor = imTv;
    }

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }

}
