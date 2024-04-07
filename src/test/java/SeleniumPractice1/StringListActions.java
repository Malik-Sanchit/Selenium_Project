package SeleniumPractice1;

import java.util.ArrayList;
import java.util.List;

public class StringListActions {

	public static void main(String[] args) {
		 List<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("David");
	        names.add("Emma");
	        names.add("Frank");
	        names.add("Grace");
	        names.add("Henry");
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
