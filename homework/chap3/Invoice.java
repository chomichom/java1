public class Invoice {
    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    private String number;
    private String description;
    private int quantity;
    private double price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            quantity = 0;

        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            price = 0.0;

        this.price = price;
    }

    public double getInvoiceAmount(){
        return quantity * price;
    }
}
