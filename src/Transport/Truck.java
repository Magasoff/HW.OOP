package Transport;

public class Truck extends Transport {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    public Truck(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    void startMove() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    void finish() {

    }

    void finishMove() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Пит-Стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Макс скорость" + maxSpeed);
    }
    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void repair() {
    }
}


