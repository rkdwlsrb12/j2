public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherdata;
	
	public CurrentConditionsDisplay(Subject wd) {
		this.weatherdata = wd;
		wd.registerObserver(this);
	}
	
	public void update(float temp, float hum, float pres) {
		this.temperature = temp;
		this.humidity = hum;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
