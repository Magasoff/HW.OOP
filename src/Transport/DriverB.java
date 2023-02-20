package Transport;

public class DriverB <T extends lightCar> extends Drive {
    public DriverB(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав B " + getName() + "начал движение");
    }

    @Override
    public void finish() {

        System.out.println("Водитель с категорией прав B " + getName() + "закончил движение");
    }


    public void refill() {
        System.out.println("Водитель с категорией прав B " + getName() + "заправляет авто");
    }

    public String getMessage(T lightCar) {
        return "Водитель" + getName() + " управляет автомобилем " + lightCar.getBrand() + " " + lightCar.getModel() + " будет участвовать в заезде ";
    }
}


