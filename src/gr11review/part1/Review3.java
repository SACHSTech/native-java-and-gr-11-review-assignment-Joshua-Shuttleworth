package gr11review.part1;

/**
* Create a program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in
* decreasing order. You will need to create two separate loops with a blank line between them.
* @author: J. Shuttleworth
*/

public class Review3{
    public static void main(String[] args){
        // Loop that outputs every odd number from 20-100
        for(int i=20;i<100;i++){
            i++;
            System.out.println(i);
        }
        // Output a line to seperate both loops
        System.out.println("");
        // Loop that outputs every number counting down from 29-2
        for(int i=29;i>=2;i--){
            System.out.println(i);
        }
    }   
}