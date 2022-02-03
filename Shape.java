package Collections;

public interface Shape {
    void draw();
}

class Parallelogram implements Shape {
    public void draw() {
        System.out.println("This is Parallelogram");
    }
}
class Square extends Parallelogram {
    @Override
    public void draw() {
        System.out.println("This Parallelogram is Square");
    }

    public static void main(String args[]) {

        Square square = new Square();
        square.draw();
    }

}
