import java.util.Scanner;

public class GUI {

    CarRepository cr = new CarRepository();
    Scanner scanner = new Scanner(System.in);

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
        for(Car tempraryCar : this.cr.carList) {
            if(tempraryCar != null && !tempraryCar.rent) {
                System.out.println("-----------------");
                System.out.println("Id: " + tempraryCar.id);
                System.out.println("Marka: " + tempraryCar.brand);
                System.out.println("Model: " + tempraryCar.model);
                System.out.println("VIN: " + tempraryCar.vin);
                System.out.println("-----------------");
            }
        }
        this.showMainMenu();
    }

    void rentCar() {
        System.out.println("Wpisz id samochodu:");
        String carId = this.scanner.nextLine();
        for(Car temporaryCar : this.cr.carList) {
            if(temporaryCar != null && temporaryCar.id == Integer.parseInt(carId)) {
                if(!temporaryCar.rent) {
                    temporaryCar.rent = true;
                    System.out.println("Udało się !!");
                } else {
                    System.out.println("Auto niedostępne !!");
                }
                break;
            }
        }
        this.showMainMenu();
    }
}
