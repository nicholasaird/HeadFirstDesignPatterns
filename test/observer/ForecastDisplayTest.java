package observer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ForecastDisplayTest {
    WeatherData weatherData;
    ForecastDisplay forecastDisplay;

    @Before
    public void setUp(){
        weatherData = new WeatherData();
        forecastDisplay = new ForecastDisplay(weatherData);
    }

    @After
    public void tearDown(){
        weatherData = null;
        forecastDisplay = null;
    }

    @Test
    public void testNoWeatherUpdate() {
        assertEquals("No change in weather", forecastDisplay.displayString());
    }

    @Test
    public void testFirstWeatherUpdate() {
        weatherData.setMeasurements(1, 2, 3);
        assertEquals("No change in weather", forecastDisplay.displayString());
    }

    @Test
    public void testImprovingWeather() {
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(0, 0, 1);
        assertEquals("Improving weather!", forecastDisplay.displayString());
    }

    @Test
    public void testImprovingWeatherAfterWorse() {
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(0, 0, -1);
        weatherData.setMeasurements(0, 0, 0);
        assertEquals("Improving weather!", forecastDisplay.displayString());
    }

    @Test
    public void testWorseningWeather() {
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(0, 0, -1);
        assertEquals("Worsening weather!", forecastDisplay.displayString());
    }

    @Test
    public void testWorseningWeatherAfterImproving() {
        weatherData.setMeasurements(0, 0, 0);
        weatherData.setMeasurements(0, 0, 1);
        weatherData.setMeasurements(0, 0, 0);
        assertEquals("Worsening weather!", forecastDisplay.displayString());
    }
}
