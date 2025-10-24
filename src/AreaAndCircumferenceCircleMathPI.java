import java.util.Scanner;

public class AreaAndCircumferenceCircleMathPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius *  radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of circle: " + area) ;
        System.out.println("Circumference of a circle: " + circumference);

    }
}
