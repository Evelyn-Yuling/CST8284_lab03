/*
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */


/*	Add an import statement so this class can use the EventSchedule class				*/
package CST8284.LAB3;

import java.util.Calendar;

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * DONE:	Complete the documentation of this class
 * 
 * @author Yuling Li
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		/*	DONE:	COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
		 *			Hint:  See the SampleOutput provided below to determine what print statements are required.
		*/
		
		/**
		 * print the heading: current date and "Just creating 4 EventSchedules"
		 */
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("This was run on " + month +" " + day + " " + year);
		System.out.println();
		System.out.println("Just creating 4 EventSchedules");
		
		/**
		 * Print EventSchedule1 + currentDate
		 */
		System.out.println();
		System.out.println("EventSchedule1");
		new EventSchedule().createReport();
		
		/**
		 * print EventSchedule2 + 2023 + current month + current day
		 */
		System.out.println();
		System.out.println("EventSchedule2");
		new EventSchedule(2023).createReport();
		
		/**
		 * print EventSchedule3 +2023 + 12 + current day
		 */
		System.out.println();
		System.out.println("EventSchedule3");
		new EventSchedule(2023,12).createReport();
		
		/** 
		System.out.println();
		System.out.println("EventSchedule4");
		new EventSchedule(2023,12,15).createReport();

		/*
		 *	PROVIDE OUTPUT THAT LOOKS LIKE THE FOLLOWING (without the *):
		 * This was run on January 17, 2024
		 * 
		 * Just creating 4 EventSchedules
		 * 
		 * EventSchedule1
		 * EventSchedule(int, int, int) was called
		 * EventSchedule() was called
		 * EventSchedule, 2024/1/17
		 *
		 * 
		 * EventSchedule2
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int) was called
		 * EventSchedule, 2023/1/17
		 * 
		 * 
		 * EventSchedule3
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int, int) was called
		 * EventSchedule, 2023/12/17
		 * 
		 * 
		 * EventSchedule4
		 * EventSchedule(int, int, int) was called
		 * EventSchedule, 2023/12/15
		 */
		
	}

}
