package Transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final Integer year;
    private final String country;
    private final String color;
    private final String transmission;
    private final String carBody;
    private final Integer registrationNumber;
    private final Integer numberSeats;
    private final String atributte;

    private class  Key {
        public void startEngine () {
            System.out.println("Удаленный запуск двигателя");
        }
        public void  keylessAccess () {
            System.out.println("Бесключевой доступ");
        }

    }

    public Car(String brand, String model, double engineVolume, Integer year, String country, String color,
               String transmission, String carBody, Integer registrationNumber, Integer numberSeats, String atributte) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.engineVolume = validateEnginePower(engineVolume);
        this.year = validateYear(year);
        this.country = validateCarParametres(country);
        this.color = validateCarColor(color);
        this.transmission = validateCarParametres(transmission);
        this.carBody = validateCarParametres(carBody);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberSeats = validateNumberSeats(numberSeats);
        this.atributte = atributte;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public Integer getNumberSeats() {
        return numberSeats;
    }

    public String isAtributte() {
        return atributte;
    }

    public void start () {
        Key key = new Key();
        key.startEngine();
        key.keylessAccess();
    }

    @Override
    public String toString() {
        return " Марка автомобиля: " + brand + " Модель автомобиля: " + model + " объем двигателя: " + engineVolume +
                " Цвет автомобиля: " + color + " год выпуска автомобиля: " + year + " страна сборки автомобиля: " + country + " трансмиссия автомобиля: " +
                transmission + " кузов автомобиля: " + carBody + " Рег.знак: " + registrationNumber + " количество мест: " + numberSeats + " тип шины: " + atributte;
    }

    public static double validateEnginePower(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    private static String validateCarColor(String value) {
        return value == null ? "белый" : value;
    }

    public static String validateCarParametres(String Value) {
        return Utile.validateString(Value, "default");
    }

    public static int validateRegistrationNumber(int value) {
        return value <= 0 ? 777 : value;
    }

    public static int validateNumberSeats(int value) {
        return value <= 0 ? 5 : value;
    }
}

