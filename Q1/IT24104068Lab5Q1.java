import java.util.Scanner;

public class IT24104068Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = Math.min(num1, Math.min(num2, num3));

        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}

