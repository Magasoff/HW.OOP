package Transport;

import static Transport.Car.*;
import static Transport.Utile.validateInteger;


public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private Integer maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int year, String country, String color, Integer maxSpeed, String fuel) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.year = validateYear(year);
        this.country = validateCarParametres(country);
        this.color = validateCarColor(color);
        this.maxSpeed = validateInteger(maxSpeed, 20);
        this.fuel = fuel;
    }

    public Transport(String brand, String model, int year, String country, String color) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.year = validateYear(year);
        this.country = validateCarParametres(country);
        this.color = validateCarColor(color);
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

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public static Integer validateYear(Integer value) {

        return value == null ? 2000 : value;
    }

    public static String validateCarColor(String value) {

        return value == null ? "белый" : value;
    }

    public static String validateCarParametres(String Value) {

        return Utile.validateString(Value);
    }

    public static int validateNumberSeats(int value) {

        return value <= 0 ? 5 : value;
    }

    abstract void Refill (String fuel);

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
