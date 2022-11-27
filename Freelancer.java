package home2;

public class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return 20 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.); Почасовая ставка: %.2f (руб.)",
                surname, name, calculateSalary(), salary);
    }
}
