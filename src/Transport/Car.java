package Transport;

public class  Car extends Transport {

    private double engineVolume;
    private final String transmission;
    private final String carBody;
    private final Integer registrationNumber;
    private final Integer numberSeats;
    private final String atributte;

    private Key key;

    public static class Key {
        private final Boolean remoteStart;
        private final Boolean keyLessAccess;

        public Key(Boolean remoteStart, Boolean keyLessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keyLessAccess = validateBoolean(keyLessAccess);
        }

        public static Boolean validateBoolean(Boolean value) {
            return value != null && value;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }
    }

    public Car(String brand, String model, double engineVolume, Integer year, String country, String color,
               String transmission, String carBody, Integer registrationNumber, Integer numberSeats, String atributte, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = validateEnginePower(engineVolume);
        this.transmission = validateCarParametres(transmission);
        this.carBody = validateCarParametres(carBody);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberSeats = validateNumberSeats(numberSeats);
        this.atributte = atributte;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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

    @Override
    public String toString() {
        return super.toString() + " , " +
                " объем двигателя: " + engineVolume  + " трансмиссия автомобиля: " +
                transmission + " кузов автомобиля: " + carBody + " Рег.знак: " + registrationNumber + " количество мест: " + numberSeats + " тип шины: " + atributte;
    }

    public static double validateEnginePower(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null ? 2000 : value;
    }

    public static String validateCarColor(String value) {
        return value == null ? "белый" : value;
    }

    public static String validateCarParametres(String Value) { return Utile.validateString(Value, "default");}

    public static int validateRegistrationNumber(int value) {
        return value <= 0 ? 777 : value;
    }

    public static int validateNumberSeats(int value) {
        return value <= 0 ? 5 : value;
    }
}