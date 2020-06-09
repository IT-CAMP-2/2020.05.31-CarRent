public class VehicleRepository {
    private Vehicle[] vehicles = new Vehicle[10];

    VehicleRepository() {
        Car c1 = new Car(1, "BMW", "3", "jkasydg");

        Car c2 = new Car(2, "Toyota", "Corolla", "yuuyruru");

        Car c3 = new Car(3, "Audi", "A5", "qry6535qwy");

        this.vehicles[0] = c1;
        this.vehicles[1] = c2;
        this.vehicles[2] = c3;

        this.vehicles[3] = new Bus(4, "Solaris", "152",
                "hjsgdfa", 40, 6);

        this.vehicles[4] = new Bus(5, "Solaris", "A100",
                "t6is6adsdy", 45, 6);
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
