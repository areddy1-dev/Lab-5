import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class userStrings {

	public static void main(String[] args) throws IOException {
		String userInput = "";
		String file = "userStrings.txt";

		Scanner scan = new Scanner(System.in);

		FileWriter writer = new FileWriter(file);

		System.out.println("Enter strings and type \"done\" when youre done:");

		//takes user input until they type "done"
		while (!userInput.equalsIgnoreCase("DONE")) {
			userInput = scan.nextLine();
			if (!userInput.equalsIgnoreCase("DONE")) {
				System.out.println("Enter strings and type \"done\" when youre done:");
				writer.write(userInput + "\n"); //sends to file
			}

		}
		scan.close();
		writer.close();

	}

}
