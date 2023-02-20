package Transport;

public abstract class Transport implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;



    public Transport(String brand, String model, double engineVolume, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
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

    @Override
    public String toString() {
        return " Transport: " + "марка: " + brand + " модель: " + model + " объем двигателя: " + engineVolume;
    }

    abstract void startMove();

    abstract void finish();

    abstract void finishMove();

    public abstract void getPitStop();

    public abstract void getBestLapTime();

    public abstract void getBestTime();

    public abstract void getMaxSpeed();

    public abstract boolean diagnostics();

    public abstract void repair();

}