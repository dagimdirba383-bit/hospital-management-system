public class Doctor extends Person {

  private String specialization;

  public Doctor(String name, int age, String specialization) {
    super(name, age);
    this.specialization = specialization;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public void displayRole() {
    System.out.println("I am a Doctor.");
  }

  public void treatPatient() {
    System.out.println("Doctor is treating a patient.");
  }

  public void prescribeMedicine() {
    System.out.println("Medicine prescribed.");
  }
}
