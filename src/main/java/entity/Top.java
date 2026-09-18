package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Top extends Cloths{
    private Sleeves sleeve;

    public Top(String name, Size size, double price, Material material, Sleeves sleeve) {
        super(name, size, price, material);
        this.sleeve = sleeve;
    }
}