package summerProject;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		int fahrenheit = 20;
		while(fahrenheit<=80) {
			double celsius= (5.0/9.0)*(fahrenheit-32);
			System.out.println(fahrenheit+" degrees in fahrenheit to celsius is "+celsius);
			fahrenheit+=3;
		}

	}

}
