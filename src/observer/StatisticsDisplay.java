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
    public void update(float temperature, float humidity, float pressure) {
        setTemperatures(temperature);
    }

    private void setTemperatures(float temperature) {
        if (numReadings > 0) {
            setContinuingTemperatures(temperature);
        } else {
            setInitialTemperatures(temperature);
        }
    }

    private void setContinuingTemperatures(float temperature) {
        minTemperature = Math.min(minTemperature, temperature);
        maxTemperature = Math.max(minTemperature, temperature);
        avgTemperature = (avgTemperature * numReadings + temperature)
                / (numReadings + 1);

        numReadings++;
    }

    private void setInitialTemperatures(float temperature) {
        avgTemperature = temperature;
        minTemperature = temperature;
        maxTemperature = temperature;

        numReadings++;
    }

    @Override
    public String displayMessage() {
        return String.format("Avg/Min/Max temperature = %.1fF/%.1fF/%.1fF",
                avgTemperature, minTemperature, maxTemperature);
    }
}
