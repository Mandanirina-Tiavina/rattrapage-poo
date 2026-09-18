package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Cloths {
    private String name;
    private Size size;
    private double price;
    private Material material;


}
