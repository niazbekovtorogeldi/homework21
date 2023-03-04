import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите длину, ширину и высоту параллелепипеда:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        try {
           Parallelipet parallelepiped = new Parallelipet(length, width, height);
            System.out.println("Площадь параллелепипеда: " + parallelepiped.getSurfaceArea());
            System.out.println("Объем параллелепипеда: " + parallelepiped.getVolume());
            System.out.println("Введите радиус и высоту цилиндра:");
            double radius = scanner.nextDouble();
            height = scanner.nextDouble();


            Sillindyr cylinder = new Sillindyr(radius, height);
            System.out.println("Площадь цилиндра: " + cylinder.getSurfaceArea());
            System.out.println("Обьем цилиндра: " + cylinder.getVolume());
        } catch (ParalilipetExseption e) {
            System.out.println(e.getMessage());
        } catch (SilinyrExsepcion e) {
            System.out.println(e.getMessage());
        }
    }
}

