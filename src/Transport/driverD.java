package Transport;

public class driverD extends Driver{
    public driverD(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }
    @Override
    public void startMove () {
        System.out.println("Водитель с категорией прав D " + getName() + "начал движение");
    }
    @Override
    public void finishMove () {
        System.out.println("Водитель с категорией прав D " + getName() + "закончил движение");
    }
    @Override
    public void refill () {
        System.out.println("Водитель с категорией прав D " + getName() + "заправляет авто");
    }
}
