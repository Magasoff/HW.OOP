package Transport;

public abstract class  Car extends Transport {

    public int maxSpeed;
    public int pitStopTime;
    public int bestLapTime;


    public Car(String brand, String model, double engineVolume, int maxSpeed, int pitStopTime, int bestLapTime) {
        super(brand, model, engineVolume, maxSpeed);
        this.maxSpeed = maxSpeed;
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
    }

    @Override
    void startMove () {
        System.out.println("Машина едет");
    }
    @Override
    void finish () {
        System.out.println("Машина финишировала");
    }
    @Override
    public void getPitStop () {
        System.out.println("Время питстоп" + pitStopTime);
    }
    @Override
    public void getBestLapTime () {
        System.out.println("Лучшее время" + bestLapTime);
    }
    @Override
    public int getMaxSpeed () {
        System.out.println("Максимальная скорость" + maxSpeed);
        return 0;
    }
   @Override
    public boolean diagnostics () {
        System.out.println("Авто" + getBrand() + getModel() + "прошло диагностику");
        return true;
    }
    @Override
    public void repair () {
        System.out.println("авто" + getBrand() + getModel() + "отремонтировано");
    }
    public interface Competing {
    void pitStop();
    void bestTimeCircle();
    void maxSpeed ();
    }
}







