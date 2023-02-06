class Human {
    private String name = "Lorem";
    String email;
    String id;

    void speak() {
        System.out.println("Speak");
    }

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }

    void whoami() {
        System.out.println(this.name);
    }

}

public class Object {
    public static void main(String[] args) {
        Human humanOne = new Human();

        humanOne.whoami();

    }
}