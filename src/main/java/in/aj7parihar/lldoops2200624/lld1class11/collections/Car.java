package in.aj7parihar.lldoops2200624.lld1class11.collections;

public class Car implements Comparable<Car>{
    private String model;
    private int price;
    private int maxSpeed;

    public Car(String model, int price, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public int compareTo(Car other) {
        // Asc order of price
        // return this.price - other.price;

        // Desc order of price -
        // return other.price - this.price;

        // comparison on the basis of Model
        // return this.model.compareTo(other.model);
        return other.model.compareTo(this.model);
    }

    public String toString() {
        return this.model + "\t" + this.price + "\t" + this.maxSpeed;
    }
}
