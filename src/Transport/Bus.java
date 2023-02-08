package Transport;

public abstract class Bus extends Transport {
    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, int pitStopTime, int maxSpeed1, int bestLapTime) {
        super(brand, model, year, country, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed1;
        this.bestLapTime = bestLapTime;
    }
    void startMove () {
        System.out.println("Автобус едет");
    }
    @Override
    void finish () {
        System.out.println("Автобус финишировал");
    }
    @Override
    public void getPitStop () {
        System.out.println("Время питстоп автобуса" + pitStopTime);
    }
    @Override
    public void getBestLapTime () {
        System.out.println("Лучшее время атобуса" + bestLapTime);
    }
    @Override
    public void getMaxSpeed () {
        System.out.println("Максимальная скорость автобуса" + maxSpeed);
    }
    public boolean diagnostics () {
        System.out.println("Автобус" + getBrand() + getModel() + "прошёл диагностику");
        return true;
    }
}



