package Homework04;

public class ComputerPrices {

        public static void main(String[] args) {
            // Деклариране на първия компютър и инициализация на цената му
            Computer firstComputer = new Computer(2020, 1800.50, "Windows");

            // Извличане на стойности за втория компютър и инициализация
            Computer secondComputer = new Computer(2023, 5500.01, "Linux");

            // Сравнение на цените и извеждане на резултата
            int result = firstComputer.comparePrice(secondComputer);

            if (result == -1) {
                System.out.println("Цената на първия компютър е по-висока от втория.");
            } else if (result == 1) {
                System.out.println("Цената на втория компютър е по-висока от първия.");
            } else {
                System.out.println("Цените на двата компютъра са равни.");
            }
        }
    }
