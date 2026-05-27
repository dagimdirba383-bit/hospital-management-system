public class Patient extends Person {

  private String disease;

  public Patient (String name, int age, String disease) {
    super(name, age);
    this.disease = disease;
  }

  public String getDisease() {
    return disease;
  }

  public void setDisease(String disease) {
    this.disease = disease;
  }

  public void displayRole() {
    System.out.println("I am a Patient.");
  }

  public void takeMedicine() {
    System.out.println("Patient is taking medicine.");
  }

  public void paybill() {
    System.out.println("Patient paid the hospital bill");
  }
}
