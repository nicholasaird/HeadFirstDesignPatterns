package observer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StatisticsDisplayTest {
    WeatherData weatherData;
    StatisticsDisplay statisticsDisplay;

    @Before
    public void setUp() {
        weatherData = new WeatherData();
        statisticsDisplay = new StatisticsDisplay(weatherData);
    }

    @After
    public void tearDown() {
        weatherData = null;
        statisticsDisplay = null;
    }

    @Test
    public void testNoWeatherUpdate() {
        assertEquals("Avg/Min/Max temperature = 0.0F/0.0F/0.0F", statisticsDisplay.displayString());
    }

    @Test
    public void testFirstWeatherUpdate() {
        weatherData.setMeasurements(1, 0, 0);
        assertEquals("Avg/Min/Max temperature = 1.0F/1.0F/1.0F", statisticsDisplay.displayString());
    }

    @Test
    public void testSecondWeatherUpdate() {
        weatherData.setMeasurements(1, 0, 0);
        weatherData.setMeasurements(3, 0, 0);
        assertEquals("Avg/Min/Max temperature = 2.0F/1.0F/3.0F", statisticsDisplay.displayString());
    }
}
