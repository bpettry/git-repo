package module_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		String userInput;
		Period calcAge;
		LocalDate userDate;
		LocalDate nowDate;
		
		//get the user birth date
		userInput = "1988-12-15";
		
		//convert userInput to a date
		nowDate = LocalDate.now();
	    userDate = LocalDate.parse(userInput, DateTimeFormatter.ISO_DATE);
	    
	    calcAge = Period.between(userDate,nowDate);
	    
	    System.out.println(nowDate);
	    System.out.println(userDate);
	    System.out.println(calcAge.getYears() + " years old.");

	}

}
