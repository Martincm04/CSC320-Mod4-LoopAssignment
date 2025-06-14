import java.util.Scanner;

public class LoopingWithFloats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        float number, total = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        while (count < 5) {
            System.out.print("Enter floating-point number " + (count + 1) + ": ");
            if (input.hasNextFloat()) {
                number = input.nextFloat();
                total += number;
                if (number > max) max = number;
                if (number < min) min = number;
                count++;
            } else {
                System.out.println("Invalid input. Please enter a floating-point number.");
                input.next(); // clear invalid input
            }
        }

        float average = total / 5;
        float interest = total * 0.20f;

        System.out.println("\nResults:");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Interest on Total (20%%): %.2f%n", interest);
    }
}
