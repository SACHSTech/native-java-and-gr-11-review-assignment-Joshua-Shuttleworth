package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Create a program that asks the user to enter a month number (1 = January, 2 = February etc.)
* and day and then prints the day of the year. 
* Assume that it is not a leap year.
* @author: J. Shuttleworth
*/

public class Review1{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        int monthNum, dayNum;
        // Array containing month data
        int[] months={0,31,59,90,120,151,181,212,243,273,304,334};
        // Defining BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Asking for input
        // Getting input and storing in varible
        System.out.print("Enter the month number: ");
        monthNum = Integer.parseInt(br.readLine());
        System.out.print("Enter the day number: ");
        dayNum = Integer.parseInt(br.readLine());
        // Outputting to terminal
        System.out.println(months[monthNum-1]+dayNum);
    }   
}