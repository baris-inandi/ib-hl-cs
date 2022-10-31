package study_and_extras;

public class Populate {
    public static void main(String[] args) {
        // employees: [surname, name, surname, name, surname, name]yapa
        String[] employees = new String[1200];
        String[] surnames = new String[600];

        for (int i = 0; i <= surnames.length; i++) {
            surnames[i] = employees[2 * i];
        }
    }
}
