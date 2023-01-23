package Transport;

import Transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Лада", "Гранта", 0, null, "Россия", "Оранжевый",
                null, null, 1, 5, null, "работает");
        System.out.println(car1);
        Car car2 = new Car(null, null, -0, null, "Германия", null,
                null, null, -0, -1, null,"работает");
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 2.4, 2022, "Германия", "Чёрный", "автоматическая",
                "седан", 89, 4, null, "работает");
        System.out.println(car3);


    }
}