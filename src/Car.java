public class Car {
    int id;
    String brand;
    String model;
    String vin;
    boolean rent;

    public Car(int id, String brand, String model, String vin) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.rent = false;
    }

    public Car() {
    }
}
