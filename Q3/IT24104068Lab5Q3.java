import java.util.Scanner;

public class IT24104068Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_RATE = 48000; // Room charges per day

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate the number of days
        int daysReserved = endDate - startDate;

        // Calculate discount
        double discountRate = 0;
        if (daysReserved >= 5) {
            discountRate = 0.20;
        } else if (daysReserved >= 3) {
            discountRate = 0.10;
          }

        // Calculate total cost
        double totalCost = daysReserved * ROOM_RATE * (1 - discountRate);

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.printf("Total amount to be paid: Rs %.2f%n", totalCost);
    }
}


