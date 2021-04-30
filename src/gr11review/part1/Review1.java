package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review1{
    public static void main(String[] args) throws IOException{
        int monthNum, dayNum;
        int[] months={0,31,59,90,120,151,181,212,243,273,304,334};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the month number: ");
        monthNum = Integer.parseInt(br.readLine());
        System.out.print("Enter the day number: ");
        dayNum = Integer.parseInt(br.readLine());
        System.out.println(months[monthNum-1]+dayNum);
    }   
}