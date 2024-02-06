package Homework04;

public class Computer {
    int year;
    double price;
    String operationSystem;

    // Конструктор
    public Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    // Метод за сравнение на цените на два компютъра
    public int comparePrice(Computer compare) {
        if (this.price > compare.price) {
            return -1;
        } else if (this.price < compare.price) {
            return 1;
        } else {
            return 0;
        }
    }
}


