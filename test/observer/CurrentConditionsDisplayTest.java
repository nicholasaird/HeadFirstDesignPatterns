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
	public void testNoData() {
		assertEquals("CurrentConditions: 0.0F degrees and 0.0% humidity", currentConditionsDisplay.displayString());
	}
}

