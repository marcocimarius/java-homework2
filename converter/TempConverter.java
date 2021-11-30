public class TempConverter {
    public void convertToFahr(double celsius) {
        System.out.println("Fahrenheit: " + ((celsius * 9/5) + 32));
    }

    public void convertToCelsius(double fahr) {
        System.out.println("Celsius: " + (( 5*(fahr-32))/9));
    }
}

