package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDate {
	private int year;
	private int month;
	private int day;

public static SimpleDate of(int yr, int m, int d){
	var returnValue = new SimpleDate();	
	returnValue.year = yr;
	returnValue.month = m;
	returnValue.day = d;
	return returnValue;
}
public boolean before(SimpleDate other){
	if (this.year < other.year){
	return true;
	}
	else if (this.month < other.month){
	return true;
	}
	else if (this.day <other.day){
	return true;
	}
	else{
	return false;
	}
	
}
}
