public class Sphere extends Shape3D {
    double radius;

    public Sphere(double i) {
        super();
        this.radius = i;
    }

    public double getArea() {
        return 4 * 3.14159 * radius * radius;
    }

    public double getVolume() {
        return (4.0 / 3) * 3.14159 * radius * radius * radius;
    }

    public String getName() {
        return "sphere";
    }

}
