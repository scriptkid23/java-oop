
abstract class Shape {
    int color;

    abstract void draw();
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle");
    }
  
}

public class AbstractExample {
    public static void main(String[] args) {
     //TODO: here
     Circle circle = new Circle();
     circle.draw();
    }
}
