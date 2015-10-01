import java.util.*;
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(75, 35, 58.4f);
		weatherData.setMeasurements(12, 30, 41.2f);
		weatherData.setMeasurements(50, 85, 34.2f);

	}

}
