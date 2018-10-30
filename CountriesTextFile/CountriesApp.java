package CountriesTextFile;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String directoryFolder = "resources";
		String fileName = "countries.txt";
		int input = 0;
		CountriesTextFile.createDirectory();
		CountriesTextFile.createFile(directoryFolder, fileName);

		String contin = "y";

		while (contin.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Countries Maintenance Application! ");
			System.out.println();
			System.out.println("1- See the list of countries");
			System.out.println("2- Add a country");
			System.out.println("3- Exit");

			input = Validator.getInt(sc, "\nEnter menu number: ", 1, 3);
			if (input == 1) {
				CountriesTextFile.readFromFile(directoryFolder, fileName);
			} else if (input == 2) {
				String country = Validator.getString(sc, "Please enter a country:");
				CountriesTextFile.writeToFile(country, directoryFolder, fileName);
			} else {
				break;
			}
			System.out.println();
			contin = Validator.getString(sc, "Do you want to continue? y/ n");

		}
		System.out.println();
		System.out.println("Thank you for your participation. Goodbye!");

	}

}
