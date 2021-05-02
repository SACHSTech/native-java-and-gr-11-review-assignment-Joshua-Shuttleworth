package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Review6{
    public static void main(String[] args) throws IOException{
        double entered=1, total=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String pattern="0.00";
        DecimalFormat df=new DecimalFormat(pattern);
        while(entered!=0){
            System.out.print("Enter the price for an item: ");
            entered=Double.parseDouble(br.readLine());
            total+=entered;
        }
        System.out.println("Subtotal: $"+df.format(total));
        System.out.println("Tax: $"+df.format(total*0.13));
        System.out.println("Total: $"+df.format(total*1.13));
    }   
}