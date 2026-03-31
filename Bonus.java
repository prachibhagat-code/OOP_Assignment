abstract class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String n, int i, double s) {
        super(n, i);
        salary = s;
    }

    double calculateBonus() {
        return 0.2 * salary;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String n, int i, double s, double inc) {
        super(n, i);
        salary = s;
        incentive = inc;
    }

    double calculateBonus() {
        return 0.1 * salary + incentive;
    }

    public static void main(String[] args) {
        Employee e;

        e = new Manager("Prachi", 1, 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Riya", 2, 40000, 5000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}