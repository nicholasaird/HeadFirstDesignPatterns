package observer;

public class ForecastDisplay implements DisplayElement, Observer {
	private float lastPressure;
	private float pressureDelta;
	private Boolean validValues = false;
	
	public ForecastDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		if(validValues){
			pressureDelta = pressure - lastPressure;	
		}
		else{
			pressureDelta = 0;
		}

		lastPressure = pressure;
		validValues = true;
	}

	@Override
	public void display() {
		System.out.println(displayString());
	}

	@Override
	public String displayString() {
		String message;
		
		if(pressureDelta > 0){
			message = "Improving weather!";
		}
		else if(pressureDelta < 0){
			message = "Worsening weather!";
		}
		else{
			message = "No change in weather";
		}
		
		return message;
	}
}
