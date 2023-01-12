class Animal {
    public void eat(){
        //TODO: code here
        System.out.println("eat");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
    public void speak(){
        //TODO: code here
        System.out.println("speak");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.speak();
    }
}
