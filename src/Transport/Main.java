package Transport;
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Икарус", "сто", 2.4, 3, 90, 25);
        DriverD <Bus>  driverD =  new DriverD<>(" Иванов ", true, 20);
        System.out.println(driverD.getMessage(bus));

        lightCar lightCar = new lightCar("Лада", "Гранта", 1.6, 5, 170, 10);
        DriverB <lightCar> driverB = new DriverB<>(" Петров ", true, 10);
        System.out.println(driverB.getMessage(lightCar));

        Truck truck = new Truck("Рено", "Дастер", 5.2, 15, 90, 20);
        DriverC <Truck> driverC = new DriverC<>(" Сидоров ", true, 10);
        System.out.println(driverC.getMessage(truck));
    }
}











