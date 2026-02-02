package Question3;
import java.util.Scanner;

public class Main {
/*
 * This program can display the current date and time in Tokyo and Hawaii
 * Depending on what the user picks from the interface. This was made by
 * creating Singleton and Abstract Factory designs.
 */
    public static void main(String[] args) {

    	//initialize
        Scanner input = new Scanner(System.in);
        String command;
        System.out.println("Enter command (td, tt, hd, ht, q):");
        
        //user input loop
        while (true) {
            command = input.nextLine();
            
            //quit
            if (command.equals("q")) {
                System.out.println("Program ended.");
                break;
            }
            //Tokyo Date
            else if (command.equals("td")) {
                DateObject d = TokyoCreator.getInstance().createDate();
                d.displayDate();
            } 
            //Tokyo Time
            else if (command.equals("tt")) {
                TimeObject t = TokyoCreator.getInstance().createTime();
                t.displayTime();
            } 
            //Hawaii Date
            else if (command.equals("hd")) {
                DateObject d = HawaiiCreator.getInstance().createDate();
                d.displayDate();
            } 
            //Hawaii Time
            else if (command.equals("ht")) {
                TimeObject t = HawaiiCreator.getInstance().createTime();
                t.displayTime();
            } 
            //Input error
            else {
                System.out.println("Invalid command.");
            }
        }
        //User has exited, end program here
        input.close();
    }
}