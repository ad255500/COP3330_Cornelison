public class Triangle extends Shape2D {
    double length, height;

    public Triangle(double i, double i1) {
        super();
        this.length = i;
        this.height = i1;
    }

    public double getArea() {
        return (length * height) / 2;
    }

    public String getName() {
        return "triangle";
    }
}
