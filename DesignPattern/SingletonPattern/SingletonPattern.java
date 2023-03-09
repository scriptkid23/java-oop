package DesignPattern.SingletonPattern;


public class SingletonPattern {
    static private SingletonPattern uniqueInstance;

    private String database_name;
    private String database_password;
  
    private SingletonPattern(){};
    static public SingletonPattern getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonPattern();
        }
        return uniqueInstance;
    }

    void whoami(){
        System.out.println("Whoami - 1");
    }


    public static void main(String[] args) {
        SingletonPattern pattern = getInstance();

        SingletonPattern pattern1 = new SingletonPattern();

        pattern.whoami();
    }


}
