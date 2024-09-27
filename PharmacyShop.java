import java.util.ArrayList;

public class PharmacyShop {
    private Person owner;
    private Address address;
    private ArrayList<Medicine> medicines;
    private double totalRevenue;

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.medicines = new ArrayList<>();
        this.totalRevenue = 0.0;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void updateMedicine(String medicineId, int quantity) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(medicineId)) {
                medicine.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    public void removeMedicine(String medicineId) {
        medicines.removeIf(medicine -> medicine.getMedicineId().equals(medicineId));
    }

    public void sellMedicine(String medicineId, int quantity) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(medicineId)) {
                if (medicine.getQuantity() >= quantity) {
                    medicine.setQuantity(medicine.getQuantity() - quantity);
                    totalRevenue += medicine.getPrice() * quantity;
                    System.out.println("Sold " + quantity + " of " + medicine.getName());
                } else {
                    System.out.println("Insufficient quantity!");
                }
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    public void displayMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayInformation();
        }
    }

    public void searchMedicine(String query) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineId().equals(query) || medicine.getName().equalsIgnoreCase(query)) {
                medicine.displayInformation();
                return;
            }
        }
        System.out.println("Medicine not found!");
    }

    public void printTotalRevenue() {
        System.out.println("Total Revenue: " + totalRevenue);
    }

    public void listExpiredMedicines(Date currentDate) {
        System.out.println("Expired Medicines:");
        for (Medicine medicine : medicines) {
            if (medicine.getExpiryDate().isExpired(currentDate)) {
                medicine.displayInformation();
            }
        }
    }
    public void printExpiredMedicines(Date currentDate) {
        System.out.println("Expired Medicines:");
        for (Medicine medicine : medicines) {
            if (medicine.getExpiryDate().isExpired(currentDate)) {
                medicine.displayInformation();
            }
        }
    }


    }