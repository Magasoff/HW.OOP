package Transport;


public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Man", "Man", 4, "Россия", "Чёрный", 120, 4, 130, 50);
        Bus bus1 = new Bus("bus", "bus1", 3, "Германия", "Синий", 90, 3, 100, 30);
        Car car1 = new Car("Lada", "Granta", 1.5, 190, 20, 20);
        Driver driver1 = new Driver("la", true, 1);
        System.out.println(driver1);
    }
}







