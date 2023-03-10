package Example;

public class Example {
    public static void main(String[] args) {
        Sony sony = new Sony();
        
        ConcreteRemote concreteRemote = new ConcreteRemote(sony);
        concreteRemote.turnoff();
    }
}
