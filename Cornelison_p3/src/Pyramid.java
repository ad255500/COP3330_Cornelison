public class Pyramid extends Shape3D {
    double length, height, width;

    public Pyramid(double i, double i1, double i2) {
        super();
        this.length = i;
        this.width = i1;
        this.height = i2;
    }

    public double getArea() {
        return (length * width) + (length * Math.sqrt(((width / 2) * (width / 2) + (height * height)))) + (width * Math.sqrt(((length / 2) * (length / 2)) + (height * height)));
    }

    public double getVolume() {
        return (length * width * height) / 3;
    }

    public String getName() {
        return "pyramid";
    }
}
