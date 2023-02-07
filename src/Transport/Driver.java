package Transport;

public abstract class Driver extends Transport {

    private String name;
    private boolean driveLicense;
    private int experinse;

    public Driver(String name, boolean driveLicense, int experinse) {
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

    @Override
    public void getBestLapTime() {

    }

    @Override
    public boolean diagnostics() {
        return false;
    }

    @Override
    public void repair() {

    }

    public abstract void refill();

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestTime() {

    }
}

