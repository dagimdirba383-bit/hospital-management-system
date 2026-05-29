import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Show All");
            System.out.println("4. Doctor Treats Patient");
            System.out.println("5. Introduce Everyone (Polymorphism Demo)");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = readInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> addPatient();
                case 3 -> showAll();
                case 4 -> treatPatient();
                case 5 -> introduceAll();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 0);
        sc.close();
    }

    static int readInt() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    static void addDoctor() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = readInt();
        sc.nextLine();
        System.out.print("Specialization: ");
        String spec = sc.nextLine();
        doctors.add(new Doctor(name, age, spec));
        System.out.println("Doctor added successfully!");
    }

    static void addPatient() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = readInt();
        sc.nextLine();
        System.out.print("Disease: ");
        String disease = sc.nextLine();
        patients.add(new Patient(name, age, disease));
        System.out.println("Patient added successfully!");
    }

    static void showAll() {
        System.out.println("\n--- Doctors ---");
        if (doctors.isEmpty()) {
            System.out.println("None.");
        } else {
            for (Doctor d : doctors) d.displayInfo();
        }

        System.out.println("\n--- Patients ---");
        if (patients.isEmpty()) {
            System.out.println("None.");
        } else {
            for (Patient p : patients) p.displayInfo();
        }
    }

    static void treatPatient() {
        if (doctors.isEmpty() || patients.isEmpty()) {
            System.out.println("Need at least one doctor and one patient.");
            return;
        }

        System.out.println("Select Doctor:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i).getName());
        }
        int di = readInt() - 1;
        sc.nextLine();
        if (di < 0 || di >= doctors.size()) {
            System.out.println("Invalid doctor number.");
            return;
        }

        System.out.println("Select Patient:");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i).getName());
        }
        int pi = readInt() - 1;
        sc.nextLine();
        if (pi < 0 || pi >= patients.size()) {
            System.out.println("Invalid patient number.");
            return;
        }

        Doctor doc = doctors.get(di);
        Patient pat = patients.get(pi);
        doc.treat(pat.getName(), pat.getDisease());
    }

    static void introduceAll() {
        System.out.println("\n--- Introductions ---");
        ArrayList<Person> everyone = new ArrayList<>();
        everyone.addAll(doctors);
        everyone.addAll(patients);

        if (everyone.isEmpty()) {
            System.out.println("No one to introduce yet.");
            return;
        }
        for (Person p : everyone) {
            p.introduce();
            System.out.println("---");
        }
    }
}
