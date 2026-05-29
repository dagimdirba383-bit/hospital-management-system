public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
      
        super(name, age); // V3.0 - calls parent constructor
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }

  
    public void treat(String patientName) {
        System.out.println("Dr. " + getName() + " is treating " + patientName);
    }

    public void treat(String patientName, String diagnosis) {
        System.out.println("Dr. " + getName() + " diagnosed " + patientName + " with " + diagnosis);
    }

    
    @Override
    public void displayInfo() {
        System.out.println("Doctor  : " + getName() + " | Age: " + getAge() + " | Spec: " + specialization);
    }
}
