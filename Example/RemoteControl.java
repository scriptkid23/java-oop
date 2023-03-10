package Example;

public abstract class RemoteControl{
    TV implementor;
    RemoteControl(TV imTv){
        implementor = imTv;
    }
    void setchannel(int channel)
    {
        implementor.tuneChannel(channel);
    }
    void turnon()
    {
        implementor.on();
    }
    void turnoff()
    {
        implementor.off();
    }

    
}