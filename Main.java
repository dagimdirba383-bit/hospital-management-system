import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Doctor>  doctors  = new ArrayList<>();
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Hospital Management System ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Show All");
            System.out.println("4. Doctor Treats Patient");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> addPatient();
                case 3 -> showAll();
                case 4 -> treatPatient();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 0);
    }

    static void addDoctor() {
        System.out.print("Name: ");           String name = sc.nextLine();
        System.out.print("Age: ");            int age     = sc.nextInt(); sc.nextLine();
        System.out.print("Specialization: "); String spec = sc.nextLine();
        doctors.add(new Doctor(name, age, spec));
        System.out.println("Doctor added!");
    }

    static void addPatient() {
        System.out.print("Name: ");    String name    = sc.nextLine();
        System.out.print("Age: ");     int age        = sc.nextInt(); sc.nextLine();
        System.out.print("Disease: "); String disease = sc.nextLine();
        patients.add(new Patient(name, age, disease));
        System.out.println("Patient added!");
    }

    static void showAll() {
        System.out.println("\n--- Doctors ---");
      
        if (doctors.isEmpty()) System.out.println("None.");
        for (Doctor d : doctors) d.displayInfo(); // V4.0 - runtime polymorphism

        System.out.println("\n--- Patients ---");
        if (patients.isEmpty()) System.out.println("None.");
      
        for (Patient p : patients) p.displayInfo();
    }

    static void treatPatient() {
        if (doctors.isEmpty() || patients.isEmpty()) {
          
            System.out.println("Need at least one doctor and one patient.");
            return;
        }

        System.out.println("Select Doctor:");
        for (int i = 0; i < doctors.size(); i++)
          
            System.out.println(i + ". " + doctors.get(i).getName());
        int di = sc.nextInt(); sc.nextLine();

        System.out.println("Select Patient:");
      
        for (int i = 0; i < patients.size(); i++)
            System.out.println(i + ". " + patients.get(i).getName());
      
        int pi = sc.nextInt(); sc.nextLine();

        Doctor  doc = doctors.get(di);
        Patient pat = patients.get(pi);
      
        doc.treat(pat.getName());                       
        doc.treat(pat.getName(), pat.getDisease());      
    }
}
