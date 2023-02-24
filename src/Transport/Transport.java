package Transport;

public abstract class Transport <T extends Drive> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;

    private T drive;

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

    abstract void startMove();

    abstract void finish();

    abstract void finishMove();

    @Override
    public abstract void getPitStop();

    public abstract void getBestLapTime();

    public abstract void getBestTime();

    public abstract void getMaxSpeed();

    public abstract boolean diagnostics();

    public abstract void repair();

    public abstract void printType ();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", drive=" + drive +
                '}';
    }
}













