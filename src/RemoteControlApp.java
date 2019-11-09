import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To begin, turn on the remote control by entering 'ON': ");
		kb.next();
		turnOn();
	}

	// TODO: Add pressButton() method
	public static void pressButtion() {
		System.out.println("");
	}

	// TODO: Add turnOn() method
	public static void turnOn() {
		System.out.println("TURNING ON...");
	}
}
