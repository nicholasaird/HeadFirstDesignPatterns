package observer;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CurrentConditionsDisplayTest {
	WeatherData weatherData;
	CurrentConditionsDisplay currentConditionsDisplay;
	
	@Before
	public void setUp(){
		weatherData = new WeatherData();
		currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
	}
	
	@After
	public void tearDown(){
		weatherData = null;
		currentConditionsDisplay = null;
	}

	@Test
	public void testNoWeatherUpdate() {
		assertEquals("CurrentConditions: 0.0F degrees and 0.0% humidity", currentConditionsDisplay.displayString());
	}

	@Test
	public void testFirstWeatherUpdate() {
		weatherData.setMeasurements(1, 2, 3);
		assertEquals("CurrentConditions: 1.0F degrees and 2.0% humidity", currentConditionsDisplay.displayString());
	}

	@Test
	public void testSecondWeatherUpdate() {
		weatherData.setMeasurements(1, 2, 3);
		weatherData.setMeasurements(4, 5, 6);
		assertEquals("CurrentConditions: 4.0F degrees and 5.0% humidity", currentConditionsDisplay.displayString());
	}
}

