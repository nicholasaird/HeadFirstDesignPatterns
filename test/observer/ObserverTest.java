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
	public void setup(){
		weatherData = new WeatherData();
		currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		forecastDisplay = new ForecastDisplay(weatherData);
		statisticsDisplay = new StatisticsDisplay(weatherData);
	}
	
	@After
	public void teardown(){
		weatherData = null;
		currentConditionsDisplay = null;
		forecastDisplay = null;
		statisticsDisplay = null;
	}

	@Test
	public void testAllObserversReceiveData1() {
		weatherData.setMeasurements(1, 2, 3);
		
		assertEquals("CurrentConditions: 1.0F degrees and 2.0% humidity", currentConditionsDisplay.displayString());
		assertEquals("No change in weather", forecastDisplay.displayString());
		assertEquals("Avg/Min/Max temperature = 1.0F/1.0F/1.0F", statisticsDisplay.displayString());
	}

}
