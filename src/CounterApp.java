import java.util.Scanner;
public class CounterApp {
	public static void main(String[]args){
		System.out.println("Press the enter key to stop the timer");
		Thread counter = new Thread(new Counter());
		counter.start();
		Scanner keyboard = new Scanner(System.in);
	}
}
