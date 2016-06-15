package m2.e2;

import java.math.BigDecimal;

abstract class OfficeSupply {

    private final String articulus;
    private final String color;
    private final String producer;
    private BigDecimal price;
    private String description;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OfficeSupply(String articulus, String color, String producer, BigDecimal price) {
        this.articulus = articulus;
        this.color = color;
        this.producer = producer;
        this.price = price;
        this.description = "No description";
    }
}
