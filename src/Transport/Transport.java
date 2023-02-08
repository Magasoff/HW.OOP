package Transport;

public abstract class Transport implements  Competing  {
    private final String brand;
    private final String model;
    private int maxSpeed;



    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = validateCarParametres(brand);
        this.model = validateCarParametres(model);
        this.maxSpeed = maxSpeed;

    }

    public Transport(String brand, String model, double engineVolume, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    abstract void startMove();

    abstract void finish();

    public abstract void getBestLapTime();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return " Transport: " + "марка: " + brand + " модель: " + model +
                " скорость: " + maxSpeed;
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

    public abstract boolean diagnostics();

    public abstract void repair();


}





