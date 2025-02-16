class Figure {
    double dimension1, dimension2;

    Figure(double d1, double d2) {
        this.dimension1 = d1;
        this.dimension2 = d2;
    }

    double area() {
        return 0; 
    }
}

class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dimension1 * dimension2; 
    }
}

class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dimension1 * dimension2; 
    }
}

public class TestFigure {
    public static void main(String[] args) {
        Figure rect = new Rectangle(10, 5);
        Figure tri = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Triangle Area: " + tri.area());
    }
}