package Transport;

public class Bus extends Transport <DriverD> implements  Competing {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    public Bus(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    void startMove() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void finish() {

    }

    void finishMove() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Пит-Стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время" + bestLapTime);

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void repair() {
    }
}


