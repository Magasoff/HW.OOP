package Transport;

public abstract class Car  extends Transport  {

    public int maxSpeed;
    public int pitStopTime;
    public int bestLapTime;



    public Car(String brand, String model, double engineVolume, int maxSpeed, int pitStopTime, int bestLapTime) {
        super(brand, model, engineVolume, maxSpeed);
        this.maxSpeed = maxSpeed;
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
    }


    void startMove () {
        System.out.println("Машина едет");
    }

    void finish () {
        System.out.println("Машина финишировала");
    }

    public void getPitStop () {
        System.out.println("Время питстоп" + pitStopTime);
    }

    public void getBestLapTime () {
        System.out.println("Лучшее время" + bestLapTime);
    }

    public void getMaxSpeed () {
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    public boolean diagnostics () {
        System.out.println("Авто" + getBrand() + getModel() + "прошло диагностику");
        return true;
    }

    public void repair () {
        System.out.println("авто" + getBrand() + getModel() + "отремонтировано");
    }
    public interface Competing {
        void pitStop();
        void bestTimeCircle();
        void maxSpeed ();
    }
}


