package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Instant date;
    private String description;
    private List<Cloths> clothes;
    private int quantity;

    double getTotalAmount() {
        double totalAmount= 0;
        for (Cloths cloth : clothes) {
            totalAmount += (cloth.getPrice()*quantity);
        }
        return totalAmount;
    }
}
