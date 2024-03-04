interface PublicTransport {
    void boardPassenger();
    void alightPassenger();
}
abstract class VehicleNew {
    abstract void refuel ();
}
class BusNew extends VehicleNew implements PublicTransport{

    @Override
    public void boardPassenger() {
        System.out.println("Passenger Boarded!!!");
    }

    @Override
    public void alightPassenger() {
        System.out.println("Passenger Alighted!!!");
    }

    @Override
    void refuel() {
        System.out.println("Bus Refueled!!!");
    }
}
class TaxiNew extends VehicleNew{

    @Override
    void refuel() {
        System.out.println("Taxi Refueled!!!");
    }
}
public class PublicTransportTester {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        BusNew bus = new BusNew();
        TaxiNew taxi = new TaxiNew();
        bus.boardPassenger();
        bus.alightPassenger();
        bus.refuel();
        taxi.refuel();
    }
}
