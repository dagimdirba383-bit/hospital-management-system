public class Hospital {
  
  private String hospitalName;
  
  public Hospital(String hospitalName) {
    this.hospitalName=hospitalName;
  }

  public void showHospitalName() {
    System.out.println("Hospital Name: " + hospitalName);
  }
  
  public void openHospital() {
        System.out.println("Hospital is now open.");
  }
    public void closeHospital() {
        System.out.println("Hospital is now closed.");
      }
  }
