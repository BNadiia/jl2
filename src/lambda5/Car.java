package lambda5;

import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparable{
    String model;
    int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price;
    }

    @Override
    public int compareTo(Object o1) {
        return (this.price - ((Car) o1).price);
    }
}
