package observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
	}

	@Override
	public void display() {
		System.out.println(displayString());
	}

	@Override
	public String displayString() {
		return String.format("CurrentConditions: %.1fF degrees and %.1f%% humidity", temperature, humidity);
	}
}
