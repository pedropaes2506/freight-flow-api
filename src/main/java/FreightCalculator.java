public class FreightCalculator {

    public static void main(String[] args) {

        Carrier carrier1 = new Carrier("Express Logistics", 12, 2);
        Carrier carrier2 = new Carrier("Fast Delivery", 10, 1.5);
        Carrier carrier3 = new Carrier("Test carrier", 1, -5);

        CarrierService carrierService = new CarrierService();

        carrierService.saveCarrier(carrier1);
        carrierService.saveCarrier(carrier2);

//        System.out.println(carrierService.listAllCarriers());
//
//        System.out.println(carrierService.findCarrierById(1L));

//        try {
//            System.out.println(carrierService.findCarrierById(3L));
//        }
//        catch (Exception e) {
//            throw new IllegalArgumentException(e);
//        }

        try {
            carrierService.saveCarrier(carrier3);
        } catch (IllegalArgumentException e) {
            System.out.println("Captured expected error: " + e.getMessage());
        }
    }
}
