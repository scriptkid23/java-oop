package day5;

class Rule2Parent{
    public void whoami(){
        System.out.println("Parent");
    }
}

class Rule2Child extends  Rule2Parent{
    @Override
    public void whoami() {
        super.whoami();
    }
}
public class RuleExample {
    
}
