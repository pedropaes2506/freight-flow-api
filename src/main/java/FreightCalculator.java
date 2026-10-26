public class FreightCalculator {

    public static double calculateShippingFee(double distanceKm, double weightKg) {

        double freight = 10 + (1.5 * distanceKm);

        if (weightKg > 10) {
            freight += 2 * (weightKg - 10);
        }
        return freight;
    }

    public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 15;

        System.out.println(calculateShippingFee(distanceKm, weightKg));
    }
}
