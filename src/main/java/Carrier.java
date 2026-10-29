public class Carrier {

    private Long id;
    private String name;
    private double baseFee;
    private double costPerKm;

    public Carrier(Long id, String name, double baseFee, double costPerKm) {
        this.id = id;
        this.name = name;
        this.baseFee = baseFee;
        this.costPerKm = costPerKm;
    }

    public Carrier(String name, double baseFee, double costPerKm) {
        this.name = name;
        this.baseFee = baseFee;
        this.costPerKm = costPerKm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        this.baseFee = baseFee;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }
}
