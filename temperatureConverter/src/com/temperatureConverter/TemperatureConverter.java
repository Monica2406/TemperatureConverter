package com.temperatureConverter;
import java.util.Scanner;
public class TemperatureConverter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nTemperature Converter");
	            System.out.println("1. Celsius to Fahrenheit");
	            System.out.println("2. Fahrenheit to Celsius");
	            System.out.println("3. Celsius to Kelvin");
	            System.out.println("4. Kelvin to Celsius");
	            System.out.println("5. Fahrenheit to Kelvin");
	            System.out.println("6. Kelvin to Fahrenheit");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            if (choice == 7) {
	                System.out.println("Exiting... Goodbye!");
	                break;
	            }

	            System.out.print("Enter the temperature: ");
	            double temperature = scanner.nextDouble();
	            double convertedTemperature;

	            switch (choice) {
	                case 1: // Celsius to Fahrenheit
	                    convertedTemperature = (temperature * 9 / 5) + 32;
	                    System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", temperature, convertedTemperature);
	                    break;
	                case 2: // Fahrenheit to Celsius
	                    convertedTemperature = (temperature - 32) * 5 / 9;
	                    System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", temperature, convertedTemperature);
	                    break;
	                case 3: // Celsius to Kelvin
	                    convertedTemperature = temperature + 273.15;
	                    System.out.printf("%.2f Celsius = %.2f Kelvin\n", temperature, convertedTemperature);
	                    break;
	                case 4: // Kelvin to Celsius
	                    convertedTemperature = temperature - 273.15;
	                    System.out.printf("%.2f Kelvin = %.2f Celsius\n", temperature, convertedTemperature);
	                    break;
	                case 5: // Fahrenheit to Kelvin
	                    convertedTemperature = (temperature - 32) * 5 / 9 + 273.15;
	                    System.out.printf("%.2f Fahrenheit = %.2f Kelvin\n", temperature, convertedTemperature);
	                    break;
	                case 6: // Kelvin to Fahrenheit
	                    convertedTemperature = (temperature - 273.15) * 9 / 5 + 32;
	                    System.out.printf("%.2f Kelvin = %.2f Fahrenheit\n", temperature, convertedTemperature);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        scanner.close();
	    }
	}



