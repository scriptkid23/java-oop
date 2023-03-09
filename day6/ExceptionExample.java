package day6;

import java.io.IOException;

class ObjectExample {
    public void demo() {
        System.out.println("demo");
    }

    void fall(String input) {
        System.out.println(input.toLowerCase());
    }
}

public class ExceptionExample {
    public void fall(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        var objectExample = new ObjectExample();
        objectExample.fall(null);
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }
    }
}
