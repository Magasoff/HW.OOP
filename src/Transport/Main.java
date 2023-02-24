package Transport;
public class Main {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar("Лада", "Гранта", 1.6, 20, 90, 20, bodyCar.Type3);
        lightCar.printType();
        Truck truck = new Truck("Рено", "Макс", 4.4, 20, 90, 20, loadCapacity.getValue(12.0));
        truck.printType();
        Bus bus = new Bus("Икарус", "2020", 2.2, 40, 50, 40, Size.getValue(500));
        bus.printType();
    }
}

























