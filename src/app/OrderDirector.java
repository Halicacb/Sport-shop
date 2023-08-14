package app;

public class OrderDirector {
    private final OrderBuilder builder;

    public OrderDirector(OrderBuilder builder) {
        this.builder = builder;
    }

    public void constructOrder(String tShirtColor, String capColor) {
        builder.buildTShirt(tShirtColor);
        builder.buildCap(capColor);
    }
}
