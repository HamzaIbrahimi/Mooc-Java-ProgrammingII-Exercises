package applications;

public class StandardSensor implements Sensor {

    private int val;

    public StandardSensor(int val) {
        this.val = val;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    };

    @Override
    public void setOff() {
    };

    @Override
    public int read() {
        return this.val;
    };
}
