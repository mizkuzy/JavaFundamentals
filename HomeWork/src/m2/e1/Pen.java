package m2.e1;

public class Pen {

    private String articulus;
    private final String color;
    private final String producer;

    public Pen(String articulus, String color, String producer) {
        this.articulus = articulus;
        this.color = color;
        this.producer = producer;
    }

    public String getArticulus() {
        return articulus;
    }

    public String getColor() {
        return color;
    }

    public String getProducer() {
        return producer;
    }

    public void setArticulus(String articulus) {
        this.articulus = articulus;
    }

    public String write(String text){
        return text + " was written by " + this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        return getArticulus().equals(pen.getArticulus());

    }

    @Override
    public int hashCode() {
        return getArticulus().hashCode();
    }

    @Override
    public String toString() {
        return color +" Pen{" +
                "articulus='" + articulus + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pen pen = new Pen("P123", "BLACK", "EC");
        System.out.println(pen);
        System.out.println(pen.write("Hey-hey"));
    }
}
