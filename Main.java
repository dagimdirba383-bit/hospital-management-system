public class Main {

  public static void main(String[] args) {

    Hospital hospital = new Hospital("City Hospital");
    Doctor doctor = new Doctor(
      "jhon",
      45,
      "Cardiology"
      );

    Patient patient = new Patient(
      "Mike",
      30,
      "Fever"
      );

    hospital.showHospitalName();

    doctor.displayRole();
    patient.displayRole();

    System.out.println("Doctor Name: " + doctor.getName());
    System.out.println("Patient Name: " + patient.getName());

    doctor.treatPatient();
    doctor.prescribeMedicine();

    patient.takeMedicine();
    patient.payBill();

    hospital.openHospital();
  }
}
                                
                                  
