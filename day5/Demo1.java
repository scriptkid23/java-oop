package day5;

class Tong2So {
    private int a, b;

    Tong2So(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int tong(){
        return this.a + this.b;
    }
}

class Tong3So extends Tong2So {
    private int c;
    Tong3So(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int tong(){
        return super.tong() + this.c;
    }
}

public class Demo1 {
    Tong3So tong3So = new Tong3So(1, 2, 3);

    public static void main(String[] args) {
        System.out.println(new Tong3So(1, 2, 3).tong());
    }
}
