package Transport;

public class DriverC extends Driver {
    public DriverC(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав C " + getName() + "начал движение");
    }
    @Override
    public void finishMove() {
        System.out.println("Водитель с категорией прав C " + getName() + "закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель с категорией прав C " + getName() + "заправляет авто");
    }
}
