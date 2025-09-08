package HashSet;

import java.util.HashSet;

public class Names {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Satyam Kumar");
        employeeNames.add("Satyam Rakhonde");

        for (String name : employeeNames) {
            System.out.println(name);
        }

        HashSet<String> employees = new HashSet<>();
        employees.add("Hritik");
        employees.add("Hritik mukherjee");

        for (String name : employees) {
            System.out.println(name);
        }
    }
}
