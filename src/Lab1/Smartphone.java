package Lab1;
//drived class

public class Smartphone extends Device {

private String operatingSystem;
private  int cameraResolution;

    public Smartphone(String brand, String modal, String operatingSystem, int cameraResolution) {
        super(brand, modal);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("operating System : "+operatingSystem);
        System.out.println("camaraResolution :"+cameraResolution +"MP");
    }
    public void takePhoto(){
        if (isPowerOn()){
            System.out.println("taking a photo width "+cameraResolution+"MP camera.....");
        }
        else {
            System.out.println("cannot take photo " +getBrand()+""+getModal()+"is off");
        }
    }
}
