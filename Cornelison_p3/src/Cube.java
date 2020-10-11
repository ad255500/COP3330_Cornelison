public class Cube extends Shape3D {
    double length;

    public Cube(double i) {
        super();
        this.length = i;
    }

    public double getArea() {
        return 6 * length * length;
    }

    public double getVolume() {
        return length * length * length;
    }

    public String getName() {
        return "cube";
    }

}
