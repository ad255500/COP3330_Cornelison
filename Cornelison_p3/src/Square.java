public class Square extends Shape2D {
    double length;

    public Square(double i) {
        super();
        this.length = i;
    }

    public double getArea() {
        return length * length;
    }

    public String getName() {
        return "square";
    }
}
