package Transport;

public class DriverD <T extends Bus> extends Drive {

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

    public String getMessage(T bus) {
        return "Водитель" + getName() + " управляет автомобилем " + bus.getBrand() + " " + bus.getModel() + " будет участвовать в заезде ";
    }
}

