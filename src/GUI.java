import java.util.Scanner;

public class GUI {

    private static final VehicleRepository cr = new VehicleRepository();
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMainMenu() {
        System.out.println("1. Dostępne samochody");
        System.out.println("2. Wypożycz samochód");
        System.out.println("3. Exit");

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                showCars();
                break;
            case "2":
                rentCar();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Nieprawidłowy wybór !!");
                showMainMenu();
                break;
        }
    }

    private static void showCars() {
        for(Vehicle tempVehicle : cr.getVehicles()) {
            if(tempVehicle != null && !tempVehicle.isRent()) {
                System.out.println(tempVehicle);
            }
        }
        showMainMenu();
    }

    private static void rentCar() {
        System.out.println("Wpisz id samochodu:");
        String carId = scanner.nextLine();
        for(Vehicle tempVehicle : cr.getVehicles()) {
            try {
                if (tempVehicle != null && tempVehicle.getId() == Integer.parseInt(carId)) {
                    if (!tempVehicle.isRent()) {
                        tempVehicle.setRent(true);
                        System.out.println("Udało się !!");
                    } else {
                        System.out.println("Auto niedostępne !!");
                    }
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono błędne id !!");
                rentCar();
            }
        }
        showMainMenu();
    }
}
