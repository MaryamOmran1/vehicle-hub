import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Car object
        System.out.println("Enter Car details:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Year: ");
        int carYear = scanner.nextInt();
        System.out.print("Number of Doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        Car car = new Car(carMake, carModel, carYear, doors);
        System.out.println();
        car.describe();
        car.startEngine();
        car.honk();

        System.out.println();
        // Encapsulation demo for Car
        System.out.println("Current Car Model: " + car.getModel());
        System.out.print("Enter new model for the car: ");
        String newCarModel = scanner.nextLine();
        car.setModel(newCarModel);
        System.out.println("Updated Car Model: " + car.getModel());

        System.out.println("\n--------------------------\n");

        // Create Bike object
        System.out.println("Enter Bike details:");
        System.out.print("Make: ");
        String bikeMake = scanner.nextLine();
        System.out.print("Model: ");
        String bikeModel = scanner.nextLine();
        System.out.print("Year: ");
        int bikeYear = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Type (e.g., Mountain, Road): ");
        String bikeType = scanner.nextLine();

        Bike bike = new Bike(bikeMake, bikeModel, bikeYear, bikeType);
        System.out.println();
        bike.describe();
        bike.startEngine();
        bike.ringBell();

        // Encapsulation demo for Bike
        System.out.println("Current Bike Type: " + bike.getType());
        System.out.print("Enter new type for the bike: ");
        String newBikeType = scanner.nextLine();
        bike.setType(newBikeType);
        System.out.println("Updated Bike Type: " + bike.getType());

        scanner.close();
    }
}