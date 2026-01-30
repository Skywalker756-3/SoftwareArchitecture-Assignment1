package Question3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Enter command (td, tt, hd, ht, q):");

        while (true) {
            command = input.nextLine();

            if (command.equals("q")) {
                System.out.println("Program ended.");
                break;
            } 
            else if (command.equals("td")) {
                DateObject d = TokyoCreator.getInstance().createDate();
                d.displayDate();
            } 
            else if (command.equals("tt")) {
                TimeObject t = TokyoCreator.getInstance().createTime();
                t.displayTime();
            } 
            else if (command.equals("hd")) {
                DateObject d = HawaiiCreator.getInstance().createDate();
                d.displayDate();
            } 
            else if (command.equals("ht")) {
                TimeObject t = HawaiiCreator.getInstance().createTime();
                t.displayTime();
            } 
            else {
                System.out.println("Invalid command.");
            }
        }

        input.close();
    }
}