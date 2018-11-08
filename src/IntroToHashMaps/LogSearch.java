package IntroToHashMaps;

import java.lang.annotation.Documented;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class LogSearch {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	static Object[] options = {"Add Entry", "Search by ID", "View List", "Remove Entry", "Done"};
	static HashMap<Integer, String> log = new HashMap<>();
	static String logList = "";
	static boolean done = false;
	public static void main(String[] args) {
		while(!done) {
			int chosenOption = JOptionPane.showOptionDialog(null, "Welcome to the Log", "Log", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (chosenOption) {
			case 0:
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("ID?"));
					String name = JOptionPane.showInputDialog("Name?");
					log.put(id, name);
					logList.concat("ID: " + id + " Name: " + name + ". ");
					break;
				}
				catch (NumberFormatException e) {
					break;
				}

			case 1:
				int searchId = Integer.parseInt(JOptionPane.showInputDialog("ID?"));
				JOptionPane.showMessageDialog(null, log.get(searchId));
				break;
			case 2:
				
				for (Integer integer : log.keySet()) {
					System.out.println("ID: " + integer + " Name: " + log.get(integer) + ". ");
				}
				break;
			case 3:
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("ID?"));
					log.remove(id);
					break;
				}
				catch (NumberFormatException e) {
					break;
				}
			case 4:
				done = true;
				break;
			}
		}
	}
}
