package app;

public interface OrderBuilder {
    void buildTShirt(String color);

    void buildCap(String color);

    Product getTShirt();

    Product getCap();

    double getTotalPrice();
}

class ConcreteOrderBuilder implements OrderBuilder {
    private Product tShirt;
    private Product cap;

    public void buildTShirt(String color) {
        String manufacturer = "Active Sports";
        double price = 17.0;
        tShirt = new Product(color + " T-Shirt", manufacturer, price);
    }

    public void buildCap(String color) {
        String manufacturer = "Smart caps";
        double price = 11.0;
        cap = new Product(color + " Cap", manufacturer, price);
    }

    public Product getTShirt() {
        return tShirt;
    }

    public Product getCap() {
        return cap;
    }

    public double getTotalPrice() {
        return (tShirt != null ? tShirt.getPrice() : 0) + (cap != null ? cap.getPrice() : 0);
    }
}