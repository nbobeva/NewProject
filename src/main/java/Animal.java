package Homework05;

public class Animal {
    interface IAnimal {
        void makeSomeNoise();
    }

    // Абстрактен клас Animal с общи черти за всички животни
    abstract class Animal1 {
        abstract void play();

        // Общ метод за игра
        void play() {
            System.out.println("The animal is playing.");
        }
    }

    // Събклас Bird
    class Bird extends Animal1 implements IAnimal {
        @Override
        void play() {
            System.out.println("The bird is chirping while flying.");
        }

        @Override
        public void makeSomeNoise() {
            System.out.println("The bird chirps.");
        }

        void fly() {
            System.out.println("The bird is flying.");
        }

        void synk(int numberOfBirds) {
            System.out.println("The birds are singing together, creating a louder sound.");
        }
    }

    // Събклас Cat
    class Cat extends Animal1 implements IAnimal {
        @Override
        void play() {
            System.out.println("The cat is playing with a ball of yarn.");
        }

        @Override
        public void makeSomeNoise() {
            System.out.println("The cat meows.");
        }

        void climb() {
            System.out.println("The cat is climbing a tree.");
        }
    }
}
