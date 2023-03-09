package day02;

class Person {
    String name; // instance variable
    static int id; // class variable

    void whoami(){
        // A local variable is a variable defined within a constructor, method, or initializer block. 
        String key = name + id;
        System.out.println(key);
    }

}
public class VariableExample {
    
}
