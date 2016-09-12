package observer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {
    WeatherData weatherData;
    CurrentConditionsDisplay currentConditionsDisplay;
    ForecastDisplay forecastDisplay;
    StatisticsDisplay statisticsDisplay;

    @Before
    public void setup() {
        weatherData = new WeatherData();
        currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        forecastDisplay = new ForecastDisplay(weatherData);
        statisticsDisplay = new StatisticsDisplay(weatherData);
    }

    @After
    public void teardown() {
        weatherData = null;
        currentConditionsDisplay = null;
        forecastDisplay = null;
        statisticsDisplay = null;
    }

    @Test
    public void testAllObserversReceiveData1() {
        weatherData.setMeasurements(1, 2, 3);

        assertEquals("CurrentConditions: 1.0F degrees and 2.0% humidity",
                currentConditionsDisplay.displayMessage());
        assertEquals("No change in weather", forecastDisplay.displayMessage());
        assertEquals("Avg/Min/Max temperature = 1.0F/1.0F/1.0F",
                statisticsDisplay.displayMessage());
    }

    @Test
    public void testAllObserversReceiveData2() {
        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(4, 5, 6);

        assertEquals("CurrentConditions: 4.0F degrees and 5.0% humidity",
                currentConditionsDisplay.displayMessage());
        assertEquals("Improving weather!", forecastDisplay.displayMessage());
        assertEquals("Avg/Min/Max temperature = 2.5F/1.0F/4.0F",
                statisticsDisplay.displayMessage());
    }

    @Test
    public void testRemoveObserver() {
        weatherData.setMeasurements(1, 2, 3);
        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(2, 3, 4);
        assertEquals("No change in weather", forecastDisplay.displayMessage());
    }
}
