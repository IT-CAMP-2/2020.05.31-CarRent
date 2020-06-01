public class CarRepository {
    Car[] carList = new Car[10];

    CarRepository() {
        Car c1 = new Car(1, "BMW", "3", "jkasydg");

        Car c2 = new Car(2, "Toyota", "Corolla", "yuuyruru");

        Car c3 = new Car(3, "Audi", "A5", "qry6535qwy");

        this.carList[0] = c1;
        this.carList[1] = c2;
        this.carList[2] = c3;
    }
}
