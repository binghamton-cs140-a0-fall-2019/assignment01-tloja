package assignment 01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Printwriter;
public class PlaceDOBTester {
	public static void main(String[] args){
	DateAndPlaceOfBirth object1 = new DateAndPlaceOfBirth(1999,4,1,"Austin","Texas","USA");
	DateAndPlaceOfBirth object2 = new DateAndPlaceOfBirth(1999,4,1,"Cleveland","Ohio","USA");
	DateAndPlaceOfBirth object3 = new DateAndPlaceOfBirth(2000,4,1,"Las Vegas","Nevada","USA");
	DateAndPlaceOfBirth object4 = new DateAndPlaceOfBirth(2013,3,1,"Paris","France");
	DateAndPlaceOfBirth object5 = new DateAndPlaceOfBirth(2003,6,4,"Stockholm","Sweden");
	System.out.println(object1);
	System.out.println(object2);
	System.out.println(object3);
	System.out.println(object4);
	System.out.println(object5);
	
	System.out.println(object1.hasSameBirthDayAs(object2);
	System.out.println("ABOVE SHOULD BE TRUE");
	System.out.println(object2.hasSameBirthDateAs(object3);
	System.out.println("ABOVE SHOULD BE TRUE");
	System.out.println(object1.olderThan(object2);
	System.out.println("ABOVE SHOULD BE TRUE");
	System.out.println(object2.youngerThan(object1);
	System.out.println("ABOVE SHOULD BE TRUE");
	



	
	try(var output  =new PrintWriter(new FileOutputStream(
		new File("output.txt"), true /* true means append to file */ ))){
		output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
	
	DateAndPlaceOfBirth object12 = new DateAndPlaceOfBirth(1999,4,1,"Austin","Texas","USA");
	DateAndPlaceOfBirth object22 = new DateAndPlaceOfBirth(1999,4,1,"Cleveland","Ohio","USA");
	DateAndPlaceOfBirth object32 = new DateAndPlaceOfBirth(2000,4,1,"Las Vegas","Nevada","USA");
	DateAndPlaceOfBirth object42 = new DateAndPlaceOfBirth(2013,3,1,"Paris","France");
	DateAndPlaceOfBirth object52 = new DateAndPlaceOfBirth(2003,6,4,"Stockholm","Sweden");
	output.println(object12);
	output.println(object22);
	output.println(object32);
	output.println(object42);
	output.println(object52);
	
	output.println(object12.hasSameBirthDayAs(object22);
	output.println("ABOVE SHOULD BE TRUE");
	output.println(object22.hasSameBirthDateAs(object32);
	output.println("ABOVE SHOULD BE TRUE");
	output.println(object12.olderThan(object22);
	output.println("ABOVE SHOULD BE TRUE");
	output.println(object22.youngerThan(object12);
	output.println("ABOVE SHOULD BE TRUE");



	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}	
	}
}
