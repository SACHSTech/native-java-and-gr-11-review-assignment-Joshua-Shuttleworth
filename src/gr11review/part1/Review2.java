package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Create a program that prints out a statement of options. Allow the user to select an option and react
* appropriately to the option selection using a switch case structure. The options should be as follows: 0 -
* print a joke about your hair 1 - print a joke about your feet 2 - print a joke about your clothes 3 - print a
* joke about your teacher. If an invalid option number is entered (i.e 4), output Invalid menu option.
* @author: J. Shuttleworth
*/

public class Review2{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        int menuOption;
        // Defining BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Displaying the input options
        System.out.println("0 - print an joke about your hair\n1 - print a joke about your feet\n2 - print a joke about your clothes\n3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        // Getting input and storing in varible
        menuOption = Integer.parseInt(br.readLine());
        // Switch statment to determine the selection
        // Output a joke based on the selection
        switch(menuOption){
            case 0 : 
            System.out.println("Joke about hair");
            System.out.println("punch line");
            break;
            case 1 : 
            System.out.println("Joke about feet");
            System.out.println("punch line");
            break;
            case 2 : 
            System.out.println("Joke about clothes");
            System.out.println("punch line");
            break;
            case 3 : 
            System.out.println("Joke about teacher");
            System.out.println("punch line");
            break;
            default :
            // If no valid options are selected display this
            System.out.println("Invalid menu option");
            break;
        }
    }   
}