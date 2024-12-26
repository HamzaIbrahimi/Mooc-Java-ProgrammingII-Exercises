package applications;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream()
                .allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException();
        }
        int result = (int) this.sensors.stream()
                .mapToDouble(Sensor::read)
                .average()
                .orElse(0);

        readings.add(result);
        return result;
    }

    public List<Integer> readings() {
        return readings;
    }

}
