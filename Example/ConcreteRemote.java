package Example;

public class ConcreteRemote extends RemoteControl
{
    int a;
    ConcreteRemote(TV imTv){
        super(imTv);
    }
    public void nextChannel(){
        setchannel(1 + a);
    }
    public void previousChannel(){
        setchannel(a - 1);
    }
}