package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Bottoms extends Cloths{
    private int width;

    public Bottoms(String name, Size size, double price, Material material, int width) {
        super(name, size, price, material);
        this.width = width;
    }
}
