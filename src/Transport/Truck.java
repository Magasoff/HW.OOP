package Transport;

public class Truck extends Transport <DriverC> implements Competing {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;
    private loadCapacity loadCapacity;


    public Truck(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, loadCapacity loadCapacity) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.loadCapacity = loadCapacity;
    }

    public loadCapacity getLoadCapacity () {return loadCapacity;}

    public void setLoadCapacity (loadCapacity loadCapacity) {this.loadCapacity = loadCapacity;}

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    void startMove() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void finish() {

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
    public void getBestTime() {
        System.out.println("Лучшее время" + bestLapTime);

    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void repair() {

    }
}