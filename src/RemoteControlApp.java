import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String input = "";
		String on;
		printRemote();
		System.out.println("To begin, turn on the remote control by entering 'ON': ");
		while(true) {
			on = kb.next();
			if (on.equalsIgnoreCase("On")) {
				turnOn();
				break;
			} else {
				System.out.println("Wrong input. Try again.");
			}
			
		}
		
		System.out.println("Enter a button number: ");
		
		do {
			input = kb.next();
			switch(input) {
			case "0":
			case "1":
			case "2":	
			case "3":	
			case "4":	
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				pressButtion();
				break;
			case "Off":
			case "off":
			case "OFF":
				break;
			default:
				System.out.println("Command not recognized.");
				break;
			}
		} while (!input.equalsIgnoreCase("Off")); 
			turnOff();
		
		
		kb.close();
		
	}
	public static void printRemote() {
		System.out.println("***********");
		System.out.println("* ON  OFF *");
		System.out.println("* 1  2  3 *");
		System.out.println("* 4  5  6 *");
		System.out.println("* 7  8  9 *");
		System.out.println("*    0    *");
		System.out.println("***********");
	}
	// TODO: Add pressButton() method
	public static void pressButtion() {
		System.out.println("BOOP!");
	}

	// TODO: Add turnOn() method
	public static void turnOn() {
		System.out.println("TURNING ON...");
	}
	public static void turnOff() {
		System.out.println("TURNING Off...");
	}

}
