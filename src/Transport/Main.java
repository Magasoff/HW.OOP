package Transport;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Lada", "Granta", 1.5, 2022, "Russia", "Black", "auto", "sedan",
               94, 5, "лето");
        new Car.Key(true, true);
        Car.Key key = new Car.Key(true, true);
        System.out.println(car1);
        System.out.println(key);
    }
}

