import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommandSystem commandSystem = new CommandSystem();

        while (true) {
            String command = sc.nextLine();
            commandSystem.execute(command);
            if (command.equals("exit")) break;
        }

    }
}
