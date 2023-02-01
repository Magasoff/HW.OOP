package Transport;

import static Transport.Car.*;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.year = validateYear(year);
        this.country = validateCarParametres(country);
        this.color = validateCarColor(color);
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "Марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", год=" + year +
                ", страна ='" + country + '\'' +
                ", цвет ='" + color + '\'' +
                ", скорость =" + maxSpeed +
                '}';
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    public static String validateCarColor(String value) {
        return value == null ? "белый" : value;
    }

    public static String validateCarParametres(String Value) {
        return Utile.validateString(Value, String.valueOf(20));
    }
}




