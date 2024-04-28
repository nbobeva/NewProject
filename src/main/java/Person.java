package Homework05;
class Person {
    protected String name;
    protected int age;
    protected boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (isMan ? "Male" : "Female"));
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        super.showPersonInfo();
        System.out.println("Score: " + score);
    }
}

class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0;
        } else {
            return hours * (daySalary / 8) * 1.5; // Assuming a workday of 8 hours
        }
    }

    public void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println("Daily Salary: $" + daySalary);
    }
}

public class Person {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        // Creating instances of Person, Student, and Employee and storing them in the array
        people[0] = new Person("Alice", 25, false);
        people[1] = new Person("Bob", 30, true);
        people[2] = new Student("Charlie", 20, true, 4.5);
        people[3] = new Student("Diana", 22, false, 5.0);
        people[4] = new Employee("Ethan", 35, true, 100);
        people[5] = new Employee("Fiona", 28, false, 120);
        // Add more objects as needed...

        // Iterating through the array and calling respective methods based on object type
        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }
            System.out.println();
        }

        // Calculate and display overtime for employees
        for (Person person : people) {
            if (person instanceof Employee) {
                double overtimePayment = ((Employee) person).calculateOvertime(2);
                System.out.println(person.name + " is owed $" + overtimePayment + " for 2 hours of overtime.");
            }
        }
    }
}