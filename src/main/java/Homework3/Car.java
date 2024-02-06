package Homework3;

public class Car {
    // Полета
    private int year;
    private double price;
    private boolean isSportCar;
    private double fuelTankCapacity;
    private double freeFuel;
    private String engineFuelOperationSystem;

    // Конструктор
    public Car(int year, double price, boolean isSportCar, double fuelTankCapacity,
               double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public Car(int year, String ferrari, double v, boolean b, double freeFuel, double v1, String premium_gasoline) {
    }

    // Метод за смяна на вида на горивната система
    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    // Метод за използване на гориво
    public void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            freeFuel -= fuel;
            System.out.println("Fuel used: " + fuel + " units. Remaining free fuel: " + freeFuel + " units.");
        }
    }

    // Getter методи за достъп до стойностите на полетата
    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getFreeFuel() {
        return freeFuel;
    }

    public String getEngineFuelOperationSystem() {
        return engineFuelOperationSystem;
    }


    public static void main(String[] args) {

        Car myCar = new Car(2022, 25000.0, true, 60.0, 10.0, "Gasoline");


        System.out.println("Initial Engine Fuel Operation System: " + myCar.getEngineFuelOperationSystem());


        myCar.changeEngineFuelOperationSystem("Electric");


        System.out.println("Updated Engine Fuel Operation System: " + myCar.getEngineFuelOperationSystem());


        myCar.useFuel(5.0);
    }
}