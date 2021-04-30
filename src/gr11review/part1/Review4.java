package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Review4{
    public static void main(String[] args) throws IOException{
        int N;
        double total=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String pattern="###,##0.00";
        DecimalFormat df=new DecimalFormat(pattern);
        System.out.print("How many items do you want to buy? ");
        N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            System.out.print("Enter the price for item "+(i+1)+": ");
            total += Double.parseDouble(br.readLine());
        }
        System.out.println("Subtotal: $"+df.format(total));
        System.out.println("Tax: $"+(df.format(total*0.13)));
        System.out.println("Total: $"+(df.format(total*1.13)));
    }   
}