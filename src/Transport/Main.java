package Transport;
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Икарус", "Икарус", 2.4, 3, 90, 25);
        DriverD <Bus>  driverD =  new DriverD<>(" Иванов ", true, 20);
        System.out.println(driverD.getMessage(bus));
    }
}











