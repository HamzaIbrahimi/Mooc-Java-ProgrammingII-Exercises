package applications;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public void setOn() {
        this.state = true;
    };

    public void setOff() {
        this.state = false;
    };

    public int read() {
        if (!isOn())
            throw new IllegalStateException();
        return new Random().nextInt(-30, 31);
    };
}
