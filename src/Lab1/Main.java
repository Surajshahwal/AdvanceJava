package Lab1;

public class Main {
    public static void main(String[] args) {
        Device device=new Device("Realme","9i ");
        device.displayInfo();
        device.powerOn();
        device.powerOff();
        Smartphone smartphone=new Smartphone("oppo ","A58","andraId 40",15);
        smartphone.displayInfo();
        smartphone.powerOn();
        smartphone.takePhoto();
        smartphone.powerOff();
    }
}
