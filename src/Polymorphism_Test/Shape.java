package Polymorphism_Test;

/**
 * @author fangjiulin
 * @date 2021/7/3 22:19
 */
public class Shape {
    void draw() {}
    public static void main(String[] args) {
        Shape a = new Circle();
        a.draw();

        Shape b = new Square();
        b.draw();

        Shape c = new Triangle();
        c.draw();
    }

}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }
}


