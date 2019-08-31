package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person Guy1 = new Person("Dan", "Harvey", "123948745", new DateAndPlaceOfBirth(1982, 4, 5, "Hoboken", "New Jersey", "United States"), new StreetUSAddress("40-53 Dowry Lane", "", "Hoboken", "NJ", "12112"));
		
		ComputerOwner compOwner = new ComputerOwner(Guy1);
		Computer computer1 = new Computer("Dell", "Destroyer", 16, 500, true, 800.00);
		Computer computer2 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer computer3 = new Computer("Dell", "Envy", 16, 2000, true, 1500.00);
		Computer computer4 = new Computer("Apple", "Mac", 16, 300, false, 3000.00);

		compOwner.addComputer(computer1);
		compOwner.addComputer(computer2);
		compOwner.addComputer(computer3);
		compOwner.addComputer(computer4);
		System.out.println(compOwner);
		
		compOwner.removeComputer(2);
		compOwner.removeComputer(2);
		System.out.println(compOwner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		
		Person Guy12 = new Person("Dan", "Harvey", "123948745", new DateAndPlaceOfBirth(1982, 4, 5, "Hoboken", "New Jersey", "United States"), new StreetUSAddress("40-53 Dowry Lane", "", "Hoboken", "NJ", "12112"));
		
		ComputerOwner compOwner2 = new ComputerOwner(Guy1);
		Computer computer12 = new Computer("Dell", "Destroyer", 16, 500, true, 800.00);
		Computer computer22 = new Computer("Microsoft", "Go", 8, 1100, false, 500.00);
		Computer computer32 = new Computer("Dell", "Envy", 16, 2000, true, 1500.00);
		Computer computer42 = new Computer("Apple", "Mac", 16, 300, false, 3000.00);

		compOwner2.addComputer(computer12);
		compOwner2.addComputer(computer22);
		compOwner2.addComputer(computer32);
		compOwner2.addComputer(computer42);
		System.out.println(compOwner2);
		
		compOwner2.removeComputer(2);
		compOwner2.removeComputer(2);
		System.out.println(compOwner2);





		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

