package my.learn.weather;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		WeatherWebServiceSoap soap = new WeatherWebService().getWeatherWebServiceSoap();
		ArrayOfString array = soap.getSupportCity("山东");
		List<String> citysList = array.getString();
		citysList.forEach(c -> System.out.print(c));

		ArrayOfString weathers = soap.getWeatherbyCityName("烟台");
		List<String> weatherList = weathers.getString();
		weatherList.forEach(w -> System.out.println(w));
	}
}
