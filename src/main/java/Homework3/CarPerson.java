package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        // Създаване на два обекта от тип Car
        Car car1 = new Car(2000, 10000.0, true, 10.0, 3.0, "Gasoline");
        Car car2 = new Car(2022, 50000.0, false, 15.0, 15.0, "Diesel");

        // Извеждане на начални стойности на колите
        System.out.println("Initial Car 1 Details:");
        displayCarDetails(car1);

        System.out.println("Initial Car 2 Details:");
        displayCarDetails(car2);


        car1.useFuel(35.0);


        car2.changeEngineFuelOperationSystem("Electric");


        System.out.println("\nUpdated Car 1 Details:");
        displayCarDetails(car1);

        System.out.println("\nUpdated Car 2 Details:");
        displayCarDetails(car2);
    }


    private static void displayCarDetails(Car car) {
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Is Sport Car: " + car.isSportCar());
        System.out.println("Fuel Tank Capacity: " + car.getFuelTankCapacity() + " gallons");
        System.out.println("Free Fuel: " + car.getFreeFuel() + " gallons");
        System.out.println("Engine Fuel Operation System: " + car.getEngineFuelOperationSystem());
        System.out.println("--------------");
    }
}