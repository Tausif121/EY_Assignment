package work;
import java.util.ArrayList;
import java.util.Iterator;

public class Listprograms {

	public static void main(String[] args) {
		ArrayList<String> calendarList = new ArrayList<String>();
		calendarList.add("January");
		calendarList.add("February");
		calendarList.add("March");
		calendarList.add("April");
		calendarList.add("May");
		calendarList.add("June");
		calendarList.add("July");
		calendarList.add("August");
		calendarList.add("September");
		calendarList.add("October");
		
		Iterator<String> itr = calendarList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		String search = "May";
		boolean found = calendarList.contains(search);
		System.out.println("\nSearching for : " + search + "\n" + (found ? "Found !" : "Not Found !"));
		calendarList.add("November");
		calendarList.add("December");
		calendarList.add("Monday");
		calendarList.add("Tuesday");
		calendarList.add("Wednesday");
		
		for(int j=0;j<5;j++)
		{
			calendarList.remove(0);
		}
		
		System.out.println("\nUpdated :");
		Iterator<String> iter = calendarList.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
