package Transport;

public class LightCar extends Transport <DriverB> implements Competing {
    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    private bodyCar bodyCar;

    private boolean diagnostickPassed;

    public LightCar(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, bodyCar bodyCar) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.bodyCar = bodyCar;

    }

    public bodyCar getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(bodyCar bodyCar) {
        this.bodyCar = bodyCar;
    }

    public void printType() {
        if (getBodyCar() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyCar());
        }
    }

    @Override
    public boolean passDiagnostics () {
        return this.passDiagnostics();
    }

    void startMove() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    void finish() {

    }

    void finishMove() {
        System.out.println("Автомобиль закончил движение");
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

    public boolean diagnostics() {
        return false;
    }

    public void repair() {

    }
}

