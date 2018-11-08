package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	static Stack<Character> characters = new Stack<>();
	static String text = "";
	static JFrame frame = new JFrame("Text");
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel(text);
	
	public TextUndoRedo() {
		frame.add(panel);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
		panel.setVisible(true);
		label.setVisible(true);
		panel.addKeyListener(this);
		frame.setTitle("Rubber Ducky");
	}
	
	public static void main(String[] args) {
		TextUndoRedo myTextUndoRedo = new TextUndoRedo();
	}
	public static void setup() {
	}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				characters.push(text.charAt((text.length()-1)));
				text = (text.substring(0, text.length() -2));
			}
			else if (e.getKeyCode() == KeyEvent.VK_DEAD_TILDE) {
				text.concat("" + characters.pop());
			}
			else {
				text.concat("" + e.getKeyChar());
			}
			frame.setTitle(text);
			System.out.println(text);
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}
	

