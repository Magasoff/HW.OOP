package Transport;

public class DriverC <T extends Truck> extends Drive {
    public DriverC(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав C " + getName() + "начал движение");
    }

    @Override
    public void finish() {

        System.out.println("Водитель с категорией прав C " + getName() + "закончил движение");
    }


    public void refill() {
        System.out.println("Водитель с категорией прав C " + getName() + "заправляет авто");
    }

    public String getMessage (T truck) {
        return "Водитель" + getName() + " управляет автомобилем " + truck.getBrand() + " " + truck.getModel() + " будет участвовать в заезде ";
    }
}
