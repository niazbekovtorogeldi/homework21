public class Parallelipet {
    private double length;
    private double width;
    private double height;

    public Parallelipet(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new ParalilipetExseption("ошибка числа должны быть без минуса");
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double getVolume() {
        return length * width * height;
    }
}
