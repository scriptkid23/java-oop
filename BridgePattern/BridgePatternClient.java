package BridgePattern;

public class BridgePatternClient {
    public static void main(String[] args) {
        TV sonyTv = new Sony();

        ConcreteRemote concreteRemote = new ConcreteRemote(sonyTv);

        concreteRemote.off();
    }
}
