package SeleniumPractice1;

import java.util.ArrayList;
import java.util.List;

public class StringListActions {

	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
	        names.add("sanchit");
	        names.add("malik");
	        names.add("Charlie");
	        names.add("sam");
	        names.add("peter");
	        names.add("david");
	        names.add("john");
	        names.add("mike");
	        names.add("Ivy");
	        names.add("Jack");

	        // Iterate over the list using a for loop
	        for (String name : names) {
	            // Perform multiple actions on each string
	            System.out.println("Original Name: " + name);
	            System.out.println("Uppercase Name: " + name.toUpperCase());
	            System.out.println("Length of Name: " + name.length());
	            System.out.println();
	        }

	}

}
