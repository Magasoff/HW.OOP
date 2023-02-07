package Transport;

public class Truck extends  Transport {
    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    public Truck(String brand, String model, int year, String country, String color, int maxSpeed, int pitStopTime, int maxSpeed1, int bestLapTime) {
        super(brand, model, year, country, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }
    void startMove () {
        System.out.println("Грузовик едет");
    }
    @Override
    void finish () {
        System.out.println("Грузовик финишировал");
    }
    @Override
    public void getPitStop () {
        System.out.println("Время питстоп грузовика" + pitStopTime);
    }
    @Override
    public void getBestLapTime () {
        System.out.println("Лучшее время грузовика" + bestLapTime);
    }
    @Override
    public int getMaxSpeed () {
        System.out.println("Максимальная скорость грузовика" + maxSpeed);
        return 0;
    }
    public boolean diagnostics () {
        System.out.println("Грузовик" + getBrand() + getModel() + "прошло диагностику");
        return true;
    }
}
