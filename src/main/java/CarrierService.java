import java.util.ArrayList;
import java.util.List;

public class CarrierService {

    private List<Carrier> carriers = new ArrayList<>();

    private Long nextId = 1L;

    public Carrier saveCarrier(Carrier carrier) {
        if (carrier == null) {
            throw new IllegalArgumentException("Carrier cannot be null");
        }
        if (carrier.getName() == null || carrier.getName().isBlank()) {
            throw new IllegalArgumentException("Carrier name cannot be null or empty");
        }
        if (carrier.getBaseFee() < 0 || carrier.getCostPerKm() < 0) {
            throw new IllegalArgumentException("Carrier fees cannot be negative");
        }

        carrier.setId(nextId++);
        carriers.add(carrier);
        return carrier;
    }

    public List<Carrier> listAllCarriers() {
        return carriers;
    }

    public Carrier findCarrierById(Long id) {
        for (Carrier carrier : carriers) {
            if (carrier.getId().equals(id)) {
                return carrier;
            }
        }

        throw new IllegalArgumentException("Carrier not found with ID: " + id);
    }
}
