package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review5{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        int years=0;
        double invested,intrest,target,total=0.00;
        // Defining BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Asking for input
        // Getting input and storing in varible
        System.out.print("Enter the yearly invested amount: ");
        invested=Double.parseDouble(br.readLine());
        System.out.print("Enter the compound interest rate: ");
        intrest=Double.parseDouble(br.readLine());
        System.out.print("Enter the target amount: ");
        target=Double.parseDouble(br.readLine());
        // Dividing 'intrest' by 100
        intrest=intrest/100;
        // Loop that repeats until target is less then total
        while(target>total){
            // Added invested to toal then add intrest * total to total
            total+=invested;
            total+=(intrest*total);
            years++;
        }
        // Outputting to terminal
        System.out.println("The target amount will be earned in "+years+" years.");
    }   
}