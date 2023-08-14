package app;

public class Product {
    private final String name;
    private final String manufacturer;
    private final double price;

    public Product(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public Double getPrice() {
        return price;
    }
}
