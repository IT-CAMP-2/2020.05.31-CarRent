import java.util.Scanner;

public class GUI2 {
    /*private VehicleRepository cr;
    private Scanner scanner;

    public GUI2() {
        this.cr = new VehicleRepository();
        this.scanner = new Scanner(System.in);
    }

    void showMainMenu() {
        System.out.println("1. Dostępne samochody");
        System.out.println("2. Wypożycz samochód");
        System.out.println("3. Exit");

        String choose = this.scanner.nextLine();

        switch (choose) {
            case "1":
                this.showCars();
                break;
            case "2":
                this.rentCar();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Nieprawidłowy wybór !!");
                this.showMainMenu();
                break;
        }
    }

    void showCars() {
        for(Car tempraryCar : this.cr.getVehicles()) {
            if(tempraryCar != null && !tempraryCar.isRent()) {
                System.out.println("-----------------");
                System.out.println("Id: " + tempraryCar.getId());
                System.out.println("Marka: " + tempraryCar.getBrand());
                System.out.println("Model: " + tempraryCar.getModel());
                System.out.println("VIN: " + tempraryCar.getVin());
                System.out.println("-----------------");
            }
        }
        this.showMainMenu();
    }

    void rentCar() {
        System.out.println("Wpisz id samochodu:");
        String carId = this.scanner.nextLine();
        for(Car temporaryCar : this.cr.getCarList()) {
            if(temporaryCar != null && temporaryCar.getId() == Integer.parseInt(carId)) {
                if(!temporaryCar.isRent()) {
                    temporaryCar.setRent(true);
                    System.out.println("Udało się !!");
                } else {
                    System.out.println("Auto niedostępne !!");
                }
                break;
            }
        }
        this.showMainMenu();
    }*/
}
