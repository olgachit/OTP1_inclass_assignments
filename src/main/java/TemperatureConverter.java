import java.util.Scanner;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheitInput = scanner.nextDouble();
        System.out.println("Enter temperature in Celsius:");
        double celsiusInput = scanner.nextDouble();
        System.out.println("Enter temperature to check for extreme conditions in Celsius:");
        double extremeInput = scanner.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheitInput);
        System.out.println(fahrenheitInput + "°F is " + celsius + "°C");

        double fahrenheit = celsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + "°C is " + fahrenheit + "°F");

        if (isExtremeTemperature(extremeInput)) {
            System.out.println(extremeInput + "°C is an extreme temperature.");
        } else {
            System.out.println(extremeInput + "°C is not an extreme temperature.");
        }
    }
}