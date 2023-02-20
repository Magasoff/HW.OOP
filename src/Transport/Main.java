package Transport;
public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Сидоров", true, 5);
        lightCar lightCar = new lightCar("Лада", "Гранта", 1.6, 10, 90, 10);
        DriverC driverC = new DriverC("Петров", true, 10);
        Truck truck = new Truck("Мазда", "Маз", 4.2, 100, 90, 10);
        DriverD driverD = new DriverD("Козлов", true, 10);
        Bus bus = new Bus("Икарус", "Икар", 2.4, 100, 90, 15);
        printInfo(lightCar);
        printInfo(truck);
        printInfo(bus);
    }
    private static void printInfo (Transport <?> transport) {
        System.out.println(" Водитель управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " будет участвовать в заезде ");
    }
}
















