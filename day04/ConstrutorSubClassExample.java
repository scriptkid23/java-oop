package day04;

class Parent {
    private int a, b;

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }
}

/*
 * the call to the parent constructor must be the first statement of the
 * constructor.
 */
class Child extends Parent {
    private int c;

    Child(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int sum() {
        return super.sum() + c;
    }
}

public class ConstrutorSubClassExample {
    public static void main(String[] args) {
        System.out.println(new Child(1, 2, 3).sum());
    }
}