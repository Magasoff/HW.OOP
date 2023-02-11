package Transport;

public  class LightCar extends  Transport {
    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;


    public LightCar(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    void startMove() {
        System.out.println("Авто начал движение");
    }

    @Override
    void finish() {
        System.out.println("Авто закончил движение");

    }

    @Override
    public void getPitStop() {
        System.out.println("Пит-Стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время" + bestLapTime);

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Макс.скорость движения" + maxSpeed);

    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Авто" + getBrand() + getModel() + "отремонтировано");

    }
}