public class Sillindyr {
    private double radius;
    private double height;
    private static final double PI = 3.14159;

    public Sillindyr(double radius, double height) {
        if (radius <= 0 || height <= 0) {
            throw new SilinyrExsepcion("вы должны ввести без миинуса");
        }
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * PI * radius * (height + radius);
    }

    public double getVolume() {
        return PI * radius * radius * height;
    }

}
