package IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.stream.events.Namespace;

import org.junit.experimental.theories.Theories;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	static Object[] options = {"Add Name", "View Names"};
	static ArrayList<String> names = new ArrayList<String>();
	static String guestList = "";
	static boolean done = false;
	public static void main(String[] args) {
		while(!done) {
			int chosenOption = JOptionPane.showOptionDialog(null, "Welcome to the Guest Book", "Guest Book", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (chosenOption==0) {
				names.add(JOptionPane.showInputDialog(null, "Whose name?"));
				System.out.println(names);
				guestList += ("Guest #" + names.size() + ": " + names.get(names.size()-1) + ". ");
			}
			
			else if (chosenOption==1) {
				/*for (int i = 1; i >= names.size();i++) {
					
				}*/
				System.out.println(guestList);//JOptionPane.showMessageDialog(null, guestList);
				done = true;
			}
		}
	}
}
