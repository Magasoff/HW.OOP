
package Transport;

public  abstract class Driver extends Transport {

    private String name;
    private boolean driveLicense;
    private int experinse;

    public Driver(String brand, String model, int year, String country, String color, int maxSpeed, String name, boolean driveLicense, int experinse) {
        super(brand, model, year, country, color, maxSpeed);
        this.name = name;
        this.driveLicense = driveLicense;
        this.experinse = experinse;
    }

    public Driver(String brand, String model, double engineVolume, int maxSpeed, String name, boolean driveLicense, int experinse) {
        super(brand, model, engineVolume, maxSpeed);
        this.name = name;
        this.driveLicense = driveLicense;
        this.experinse = experinse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getExperinse() {
        return experinse;
    }

    public void setExperinse(int experinse) {
        this.experinse = experinse;
    }
    public abstract void startMove();

    public abstract void finish();

    public abstract void refill();

}
