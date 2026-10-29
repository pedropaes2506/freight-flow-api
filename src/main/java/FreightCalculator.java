public class FreightCalculator {

    public static void main(String[] args) {

        Carrier carrier1 = new Carrier("Express Logistics", 12, 2);

        ShippingQuote quote1 = new ShippingQuote(15, 12, carrier1);

        System.out.println("Carrier name: " + carrier1.getName());
        System.out.println("Freight Value: " + quote1.getFreightValue());
    }
}
