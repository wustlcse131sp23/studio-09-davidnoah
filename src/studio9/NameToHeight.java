package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Integer> nameToHeight = new HashMap<>();
		System.out.println("Initial map: " + nameToHeight);
		nameToHeight.put("David", 64);
		String name = "";
		int height = 0;
		while(!name.equals("Quit")) {
			System.out.println("Name and Height: ");
			name = in.next();
			if(!name.equals("Quit")) {
				height = in.nextInt();
				nameToHeight.put(name, height);
			}
			
		}
		System.out.println("New Map: " + nameToHeight);
		System.out.println("David's Height (in): " + nameToHeight.get("David"));
		

	}
}
