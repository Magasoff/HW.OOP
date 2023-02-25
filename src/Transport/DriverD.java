package Transport;

public class DriverD  extends Drive {

    public DriverD(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав D " + getName() + "начал движение");
    }

    @Override
    public void finish() {

        System.out.println("Водитель с категорией прав D " + getName() + "закончил движение");
    }


    public void refill() {
        System.out.println("Водитель с категорией прав D " + getName() + "заправляет авто");
    }
}

