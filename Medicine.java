// Medicine.java
public class Medicine {
    private String medicineId;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;
    private String batchNumber;
    private Date expiryDate;

    public Medicine(String medicineId, String name, double price, int quantity,
                    String manufacturer, String batchNumber, Date expiryDate) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.expiryDate = expiryDate;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void displayInformation() {
        System.out.println("ID: " + medicineId + ", Name: " + name + ", Price: " + price +
                ", Quantity: " + quantity + ", Manufacturer: " + manufacturer +
                ", Batch Number: " + batchNumber + ", Expiry Date: " + expiryDate);
    }
}
