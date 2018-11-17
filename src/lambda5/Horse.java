package lambda5;

public class Horse {
    String kind;
    int price;

    public Horse(String kind, int price) {
        this.kind = kind;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "kind='" + kind + '\'' +
                ", price=" + price +
                '}';
    }

}
