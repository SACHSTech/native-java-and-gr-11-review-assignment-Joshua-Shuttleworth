package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review5{
    public static void main(String[] args) throws IOException{
        int years=0;
        double invested,intrest,target,total=0.00;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the yearly invested amount: ");
        invested=Double.parseDouble(br.readLine());
        System.out.print("Enter the compound interest rate: ");
        intrest=Double.parseDouble(br.readLine());
        System.out.print("Enter the target amount: ");
        target=Double.parseDouble(br.readLine());
        intrest=intrest/100;
        while(target>total){
            total+=invested;
            total+=(intrest*total);
            years++;
        }
        System.out.println("The target amount will be earned in "+years+" years.");
    }   
}