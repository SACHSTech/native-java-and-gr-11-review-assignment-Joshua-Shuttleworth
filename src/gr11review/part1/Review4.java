package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
* Create a program that asks the user how many items he/she would like to purchase. The program then
* gets the prices for the items one by one. At the end of entering items, print out the total, the tax (13%)
* and the grand total. Import and use the java.text.DecimalFormat class to output the information in currency format (0.00)
* @author: J. Shuttleworth
*/

public class Review4{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        int N;
        double total=0;
        // Defining BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Defining new DecimalFormat with a pattern of 0.00
        DecimalFormat df=new DecimalFormat("0.00");
        // Asking for input
        // Getting input and storing in varible
        System.out.print("How many items do you want to buy? ");
        N = Integer.parseInt(br.readLine());
        // Looping for N times
        for(int i=0;i<N;i++){
            // Asking for input
            System.out.print("Enter the price for item "+(i+1)+": ");
            // Getting input and adding to total
            total += Double.parseDouble(br.readLine());
        }
        // Outputting to terminal
        System.out.println("Subtotal: $"+df.format(total));
        System.out.println("Tax: $"+(df.format(total*0.13)));
        System.out.println("Total: $"+(df.format(total*1.13)));
    }   
}