// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create owner and address
        Person owner = new Person("Ahmed Khan", "123456789");
        Address address = new Address("123 Main St", "Karachi", "75300");
        PharmacyShop pharmacy = new PharmacyShop(owner, address);

        // Sample Medicines
        pharmacy.addMedicine(new Medicine("M001", "Paracetamol", 50.0, 100, "PharmaCorp", "B123", new Date(15, 8, 2025)));
        pharmacy.addMedicine(new Medicine("M002", "Ibuprofen", 75.0, 80, "HealthMed", "B124", new Date(10, 12, 2024)));
        // Add more medicines as needed

        while (true) {
            System.out.println("\nPharmacy Management System");
            System.out.println("1. Add Medicine");
            System.out.println("2. Update Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Sell Medicine");
            System.out.println("5. Display All Medicines");
            System.out.println("6. Print Expired Medicines");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    // Add Medicine
                    System.out.print("Enter Medicine ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Enter Batch Number: ");
                    String batchNumber = scanner.nextLine();
                    System.out.print("Enter Expiry Date (DD MM YYYY): ");
                    int day = scanner.nextInt();
                    int month = scanner.nextInt();
                    int year = scanner.nextInt();
                    pharmacy.addMedicine(new Medicine(id, name, price, quantity, manufacturer, batchNumber, new Date(day, month, year)));
                    break;
                case 2:
                    // Update Medicine
                    System.out.print("Enter Medicine ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    pharmacy.updateMedicine(updateId, newQuantity);
                    break;
                case 3:
                    // Remove Medicine
                    System.out.print("Enter Medicine ID to remove: ");
                    String removeId = scanner.nextLine();
                    pharmacy.removeMedicine(removeId);
                    break;
                case 4:
                    // Sell Medicine
                    System.out.print("Enter Medicine ID to sell: ");
                    String sellId = scanner.nextLine();
                    System.out.print("Enter Quantity to sell: ");
                    int sellQuantity = scanner.nextInt();
                    pharmacy.sellMedicine(sellId, sellQuantity);
                    break;
                case 5:
                    // Display All Medicines
                    pharmacy.displayMedicines();
                    break;
                case 6:
                    // Print Expired Medicines
                    System.out.print("Enter Current Date (DD MM YYYY): ");
                    int currentDay = scanner.nextInt();
                    int currentMonth = scanner.nextInt();
                    int currentYear = scanner.nextInt();
                    pharmacy.printExpiredMedicines(new Date(currentDay, currentMonth, currentYear));
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
