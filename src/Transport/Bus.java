package Transport;

public class Bus extends Transport <DriverD> implements  Competing {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    private Size size;


    public Bus(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, Size size) {
        super(brand, model, engineVolume, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.size = size;
    }

    public Size getSize () {return size;}

    public void setSize (Size size) {this.size = size;}

    public void printType () {
        if (getSize() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getSize());
        }
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


