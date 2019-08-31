package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person Guy1 = Person("Jeff", "Diamonds", 123948745, 1982, 4, 5, "Atlantic City", "New Jersey", "United 			States", "40-53 Dowry Lane", "", "Atlantic City", "NJ", "12112");
		complist = [];
		ComputerOwner CompOwner = new ComputerOwner(Guy1, complist);
		for (i = 0, i<=4, i++){
		CompOwner.addComputer(Comp)
		
		}
		system.out.println(CompOwner);		
		for (i=0,i<=2,i++){
		CompOwner.removeComputer(i);
		}
		system.out.println(CompOwner);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
		Person Guy12 = Person("Jeff", "Diamonds", 123948745, 1982, 4, 5, "Atlantic City", "New Jersey", "United 			States", "40-53 Dowry Lane", "", "Atlantic City", "NJ", "12112");
		complist2 = [];
		ComputerOwner CompOwner = new ComputerOwner(Guy12, complist2);
		for (i = 0, i<=4, i++){
		CompOwner.addComputer(Comp)
		
		}
		Output.println(CompOwner);		
		for (i=0,i<=2,i++){
		CompOwner.removeComputer(i);
		}
		Output.println(CompOwner)



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
