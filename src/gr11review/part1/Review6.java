package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Review6{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        double entered=1, total=0;
        // Defining BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Defining new DecimalFormat with a pattern of 0.00
        DecimalFormat df=new DecimalFormat("0.00");
        // Loop while entered in not equal to 0
        while(entered!=0){
            // Asking for input
            // Getting input and storing in varible
            System.out.print("Enter the price for an item: ");
            entered=Double.parseDouble(br.readLine());
            // Add entered to total
            total+=entered;
        }
        // Outputting to terminal
        System.out.println("Subtotal: $"+df.format(total));
        System.out.println("Tax: $"+df.format(total*0.13));
        System.out.println("Total: $"+df.format(total*1.13));
    }   
}