abstract class SmartDevice{
    void turnOn(){
        System.out.println("Device turned On!!!");
    }
}
interface Connectable {
    void ConnectToWifi ();
    void disConnectFromWifi();
}
class SmartPhone extends SmartDevice implements Connectable{

    @Override
    public void ConnectToWifi() {
        System.out.println("Connected to Wifi");
    }

    @Override
    public void disConnectFromWifi() {
        System.out.println("Disconnected from Wifi");
    }
}
public class SmartDeviceTester {
    public static void main(String[] args) {
        SmartPhone sample = new SmartPhone();
        sample.turnOn();
        sample.ConnectToWifi();
        sample.disConnectFromWifi();
    }
}
