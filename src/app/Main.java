package app;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new ConcreteOrderBuilder();
        OrderDirector orderDirector = new OrderDirector(orderBuilder);

        orderDirector.constructOrder("Red", "White");
        double orderATotalPrice = orderBuilder.getTotalPrice();
        Product tShirtA = orderBuilder.getTShirt();
        Product capA = orderBuilder.getCap();

        orderDirector.constructOrder("Blue", "Black");
        double orderBTotalPrice = orderBuilder.getTotalPrice();
        Product tShirtB = orderBuilder.getTShirt();
        Product capB = orderBuilder.getCap();


        System.out.println("Заказ А:");
        System.out.println("Футболка: " + tShirtA.getName() + " (" + tShirtA.getManufacturer() + ")");
        System.out.println("Кепка: " + capA.getName() + " (" + capA.getManufacturer() + ")");
        System.out.println("Общая стоимость: " + orderATotalPrice);

        System.out.println();

        System.out.println("Заказ В:");
        System.out.println("Футболка: " + tShirtB.getName() + " (" + tShirtB.getManufacturer() + ")");
        System.out.println("Кепка: " + capB.getName() + " (" + capB.getManufacturer() + ")");
        System.out.println("Общая стоимость: " + orderBTotalPrice);
    }
}
