package Transport;

public class DriverB extends Driver {
    public DriverB(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав B " + getName() + "начал движение");
    }

    @Override
    public void finishMove() {

        System.out.println("Водитель с категорией прав B " + getName() + "закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель с категорией прав B " + getName() + "заправляет авто");
    }
}
