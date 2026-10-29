public class ShippingQuote {

    private Long id;
    private double distanceKm;
    private double weightKg;
    private Carrier carrier;
    private double freightValue;

    public double calculateShippingFee() {

        if (this.carrier == null) {
            throw new IllegalStateException("Carrier must not be null to calculate shipping fee");
        }

        double total = this.carrier.getBaseFee() + (this.carrier.getCostPerKm() * this.distanceKm);

        if (this.weightKg > 10) {
            total += 2 * (this.weightKg - 10);
        }

        this.freightValue = total;

        return this.freightValue;
    }

    public ShippingQuote(Long id, double distanceKm, double weightKg, Carrier carrier) {
        this.id = id;
        this.distanceKm = distanceKm;
        this.weightKg = weightKg;
        this.carrier = carrier;
        this.calculateShippingFee();
    }

    public ShippingQuote(double distanceKm, double weightKg, Carrier carrier) {
        this(null, distanceKm, weightKg, carrier);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(double freightValue) {
        this.freightValue = freightValue;
    }
}
