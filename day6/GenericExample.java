package day6;

import java.util.*;

class Crate<T> {
    private T contents;

    public T lookInCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}

class Elephant {
    private int weight = 300;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class LongTailAnimal {
    protected void chew(List<Integer> input) {
    }
}

class Handler {
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}

class Anteater extends LongTailAnimal {
    @Override
    protected void chew(List<Integer> input) {
        // TODO Auto-generated method stub
        super.chew(input);
    }
}

class TrickyCrate<T> {
    public <T> T tricky(T t) {
        return t;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();

        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        crateForElephant.lookInCrate().getWeight();

        TrickyCrate<Elephant> trickyCrateElephant = new TrickyCrate<>();

        System.out.println(trickyCrateElephant.tricky("elephant"));


    }
}
