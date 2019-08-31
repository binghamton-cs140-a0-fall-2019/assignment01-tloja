package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {

	Person Guy1 = new Person("Thomas", "Hudson", "321458119", new DateAndPlaceOfBirth(1983, 1, 1, "Boston", "Massachussetts", "United States"), new StreetUSAddress("1 Spooner Street", "", "Boston", "MA", "11111"));
	Person Guy2 = new Person("Derrick", "Smith", "123451189", new DateAndPlaceOfBirth(1993, 9, 9, "Brookyln", "New York", "United States"), new StreetUSAddress("2 Smith Street", "", "Brookyln", "NY", "11111"));
	Person Guy3 = new Person("Nate", "Dogg", "123451189", new DateAndPlaceOfBirth(1982, 4, 5, "Long Island", "New York", "United States"), new StreetUSAddress("3 Apple Street", "", "Long Island", "NY", "11111"));
	Person Guy4 = new Person("Fed", "Dentarion", "920311352", new DateAndPlaceOfBirth(1982, 4, 5, "Long Island", "New York", "United States"), new StreetUSAddress("4 Main Street", "", "Long Island", "NY", "11111"));
	System.out.println(Guy1);
	System.out.println(Guy2);
	System.out.println(Guy3);
	System.out.println(Guy4);
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
	DateAndPlaceOfBirth[] DOB2 = new DateAndPlaceOfBirth[1];
	DOB2[1] = new DateAndPlaceOfBirth(1983, 1, 1, "Boston", "Massachussetts", "United States");
	DOB2[2] = new DateAndPlaceOfBirth(1993, 9, 9, "Brookyln", "New York", "United States");
	DOB2[3] = new DateAndPlaceOfBirth(1982, 4, 5, "Long Island", "New York", "United States");
	DOB2[4] = new DateAndPlaceOfBirth(1982, 4, 5, "Long Island", "New York", "United States");
	StreetUSAddress[] Add2 = new StreetUSAddress[5];
	Add2[1] = new StreetUSAddress("1 Spooner Street", "", "Boston", "MA", "11111");
	Add2[2] = new StreetUSAddress("2 Smith Street", "", "Brookyln", "NY", "11111");
	Add2[3] = new StreetUSAddress("3 Apple Street", "", "Long Islands", "NY", "11111");
	Add2[4] = new StreetUSAddress("4 Main Street", "", "Long Island", "NY", "11111");
	Person Guy12 = new Person("Thomas", "Hudson", "321458119", DOB2[1], Add2[1]);
	Person Guy22 = new Person("Derrick", "Smith", "123451189", DOB2[2], Add2[2]);
	Person Guy32 = new Person("Nate", "Dogg", "123451189", DOB2[3], Add2[3]);
	Person Guy42 = new Person("Fed", "Dentarion", "920311352", DOB2[4], Add2[4]);
	output.println(Guy12);
	output.println(Guy22);
	output.println(Guy32);
	output.println(Guy42);
	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

