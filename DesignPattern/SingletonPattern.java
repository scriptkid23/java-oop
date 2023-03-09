package DesignPattern;

public class SingletonPattern {
    private static SingletonPattern uniqueSingleton;
    
    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        if(uniqueSingleton == null){
            return new SingletonPattern();
        }
        return uniqueSingleton;
    }
    // other useful method here...
}
