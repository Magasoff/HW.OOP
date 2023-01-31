package Transport;

import static Transport.Utile.validateString;

public class Bus extends Transport {

    public Bus(String brand, String model, Integer year, String country, String color, Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill(String fuel) {
        System.out.println("Автобус на топливе" + validateRefillType(fuel));
    }

    public static String validateRefillType(String value) {
        if (validateString(value) && (value.equals("diesel") || value.equals("gas"))) {
            return value;
        } else {
            return "diesel";
        }
    }
}

