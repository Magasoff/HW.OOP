package Transport;


public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Водитель кат.Б", true, 10);
        LightCar lightCar = new LightCar("Lada", "Granta", 1.5, 20, 180, 20);
        System.out.println(driverB.getName() + " управляя автомобилем " + lightCar.getBrand() + " будет участвовать в заезде ");
        DriverC driverC = new DriverC("Водитель кат.С",true, 7);
        Truck truck = new Truck("Man", "man", 4.2, 10, 90, 45);
        System.out.println(driverC.getName() + " управляя грузовиком " + truck.getBrand() + " будет участвовать в заезде");
    }
}









