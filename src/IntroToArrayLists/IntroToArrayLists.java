package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		
		//2. Add five Strings to your list
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");
		strings.add("E");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i >= strings.size() - 1;i++) {
			System.out.println(strings.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String string : strings) {
			System.out.println(string);
		}
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i <= strings.size() - 1;i+=2) {
			System.out.println(strings.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = strings.size()-1; i >= 0; i--) {
			System.out.println(strings.get(i));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (String string : strings) {
			if (string.contains("E")) {
				System.out.println(string);
			}
			
		}
	}
}
