package Transport;
public class Main {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar("Лада", "Гранта", 1.6, 20, 90, 20, bodyCar.Type3);
        lightCar.printType();
        Truck truck = new Truck("Рено", "Макс", 4.4, 20, 90, 20, loadCapacity.getValue(12.0));
        truck.printType();
        Bus bus = new Bus("Икарус", "2020", 2.2, 40, 50, 40, Size.getValue(500));
        bus.printType();

        checkTransport(bus, lightCar, truck);

    }

    public static void checkTransport(Transport... transports) {
        int count = 0;
        for (Transport transport : transports)
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + "" + transport.getModel() + "не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        System.out.println("Диагностику прошли" + count + " из " + transports + "автомобилей");
    }
}


























