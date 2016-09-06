package observer;

public class StatisticsDisplay implements DisplayElement, Observer {
    private float avgTemperature;
    private float minTemperature;
    private float maxTemperature;
    private int numReadings = 0;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (numReadings > 0) {
            minTemperature = Math.min(minTemperature, temp);
            maxTemperature = Math.max(minTemperature, temp);
            avgTemperature = (avgTemperature * numReadings + temp) / (numReadings + 1);
        }
        else {
            avgTemperature = temp;
            minTemperature = temp;
            maxTemperature = temp;
        }

        numReadings++;
    }

    @Override
    public String getDisplay() {
        return String.format("Avg/Min/Max temperature = %.1fF/%.1fF/%.1fF",
                avgTemperature, minTemperature, maxTemperature);
    }
}
