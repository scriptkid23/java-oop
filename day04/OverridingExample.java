package day04;

class Marsupial {
    public double getAverageWeight() {
        return 50;
    }
}

class Kangaroo extends Marsupial {

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

}

public class OverridingExample {
    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());
        System.out.println(new Kangaroo().getAverageWeight());
    }
}
