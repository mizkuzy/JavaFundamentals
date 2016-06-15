package m2.e2;

import java.math.BigDecimal;

public class Eraser extends OfficeSupply {

    private final String material;

    public Eraser(String color, String producer, String articulus, String material) {
        this(articulus,color,producer,BigDecimal.ZERO,material);
    }


    public Eraser(String articulus, String color, String producer, BigDecimal price, String material) {
        super(articulus, color, producer, price);
        this.material = material;
    }
}
