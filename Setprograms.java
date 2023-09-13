package work;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setprograms {

	public static void main(String[] args) {
		 Set<String> calendarSet = new HashSet<String>();
		    calendarSet.add("January");
			calendarSet.add("February");
			calendarSet.add("March");
			calendarSet.add("April");
			calendarSet.add("May");
			calendarSet.add("June");
			calendarSet.add("July");
			calendarSet.add("August");
			calendarSet.add("September");
			calendarSet.add("October");
		 
		 System.out.println("Elements after Iterating :");
		 Iterator<String> itr = calendarSet.iterator();
	        while (itr.hasNext()) {
	        	System.out.println(itr.next());
		
	}

}
}
