package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person Guy1 = new Person("Bob", "Ross", "123456789", new DateAndPlaceOfBirth(1964, 3, 23, "Seattle", "Washington", "United States"), new StreetUSAddress("123 sesame street", "", "Seattle", "WA", "11111"));
		
		ComputerOwner compOwner = new ComputerOwner(Guy1);
		Computer comp1 = new Computer("MSI", "Apache", 16, 500, true, 800.00);
		Computer comp2 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer comp3 = new Computer("MSI", "GL63", 16, 2000, true, 1500.00);
		Computer comp4 = new Computer("Apple", "Touch", 16, 300, false, 3000.00);

		compOwner.addComputer(comp1);
		compOwner.addComputer(comp2);
		compOwner.addComputer(comp3);
		compOwner.addComputer(comp4);
		System.out.println(compOwner);
		
		compOwner.removeComputer(2);
		compOwner.removeComputer(2);
		System.out.println(compOwner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		
		Person Guy12 = new Person("Bob", "Ross", "123456789", new DateAndPlaceOfBirth(1964, 3, 23, "Seattle", "Washington", "United States"), new StreetUSAddress("123 sesame street", "", "Seattle", "WA", "11111"));
		
		ComputerOwner compOwner2 = new ComputerOwner(Guy1);
		Computer comp12 = new Computer("MSI", "Apache", 16, 500, true, 800.00);
		Computer comp22 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer comp32 = new Computer("MSI", "GL63", 16, 2000, true, 1500.00);
		Computer comp42 = new Computer("Apple", "Touch", 16, 300, false, 3000.00);

		compOwner2.addComputer(comp12);
		compOwner2.addComputer(comp22);
		compOwner2.addComputer(comp32);
		compOwner2.addComputer(comp42);
		System.out.println(compOwner2);
		
		compOwner2.removeComputer(2);
		compOwner2.removeComputer(2);
		System.out.println(compOwner2);





		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

