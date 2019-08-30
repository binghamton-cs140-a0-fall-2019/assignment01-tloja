package assignment 01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Printwriter;
public class PlaceDOBTester {
	public static void main(String[] args){
	DateAndPlaceOfBirth obj1 = new DateAndPlaceOfBirth(1999,4,1,"Buffalo","New York","USA");
	DateAndPlaceOfBirth obj2 = new DateAndPlaceOfBirth(1999,4,1,"Cleveland","Ohio","USA");
	DateAndPlaceOfBirth obj3 = new DateAndPlaceOfBirth(2000,4,1,"Denver","Colorado","USA");
	DateAndPlaceOfBirth obj4 = new DateAndPlaceOfBirth(2013,3,1,"Paris","France");
	DateAndPlaceOfBirth obj5 = new DateAndPlaceOfBirth(2003,6,4,"Munich","Germany");

	
	



	
	try(var output  =new PrintWriter(new FileOutputStream(
		new File("output.txt"), true /* true means append to file */ ))){
		output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
		




	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}	
	}
}
