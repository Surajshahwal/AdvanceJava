package Lab1;
//base class
public class Device {
    private  String brand;
    private String modal;
    private boolean powerStatus;

    public String getBrand() {
        return brand;
    }

    public String getModal() {
        return modal;
    }

    public Device(String brand, String modal) {
        this.brand = brand;
        this.modal = modal;
        this.powerStatus = false;
    }


    public void powerOn(){
       this.powerStatus =true;
        System.out.println(brand+" "+modal+"is on   ");
    }
    public void powerOff(){
        this.powerStatus=false;
        System.out.println(brand+" "+modal+"is off  ");

    }
    public void displayInfo(){
        System.out.println("brand : "+brand);
        System.out.println("model :"+modal);
    }
    public boolean isPowerOn(){
        return powerStatus;
    }
}
