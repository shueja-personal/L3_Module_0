package IntroToStacks;

import static org.junit.Assert.assertArrayEquals;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import javax.print.DocFlavor.INPUT_STREAM;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<>();
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			stack.push(random.nextDouble() * 100);
			System.out.println("Adding numbers...");
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		System.out.println("First number, 0 to 100 inclusive?");
		int num1 = scanner.nextInt();
		System.out.println("Second number, greater or equal to the first?");
		int num2 = scanner.nextInt();
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("Popping...");
		for (int i = 0; i < 100; i++) {
			double num = stack.pop();
			if (num > num1 && num < num2) {
				System.out.println(num);
			}
			else {
				//System.out.println("Not in range");
			}
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
