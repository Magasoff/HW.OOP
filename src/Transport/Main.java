package Transport;

public class Main {
    public static void main(String[] args) {
       Car car1 = new Car("Лада", "Гранта", 1.5, 2017, "Россия", "Белый",
               "механика", "седан", 124, 4, "лето", 120);
        new Car.Key(true, true);
        Car.Key key = new Car.Key(true, true);
        System.out.println(key);
        System.out.println(car1);

        Bus bus1 = new Bus("Икар", "Икарус", 2012, "Израиль", "Красный",90);
        Bus bus2 = new Bus("Автобус", "Икар", 2022, "Россия", "Зеленый",100);
        Bus bus3 = new Bus("Икар", "Икарус", 2023, "Россия", "Чёрный",120);
        Bus bus4 = new Bus("Икар", "Икарус", 2021, "Россия", "Красный",60);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
    }
}


