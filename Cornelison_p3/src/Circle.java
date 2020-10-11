public class Circle extends Shape2D {
    double radius;

    public Circle(double i) {
        super();
        this.radius = i;
    }

    public double getArea() {
        return radius * radius * 3.14159;
    }

    public String getName() {
        return "circle";
    }

}
