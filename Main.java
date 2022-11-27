package home2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Employee [] employees = new Employee[10];

        for (int i = 0; i < employees.length; i++) {
            Genrate genrate = new Genrate();
            employees[i] = genrate.generateEmployee();
        }

        for (Employee e: employees) {
            System.out.println(e);
        }

    }
}
