package gr11review.part1;

public class Review8{
    public static void main(String[] args){
        // Varible declorations
        int total=0;
        // Loop for 1000 times
        for(int i=0;i<1000;i++){
            // Define 3 random numbers
            int number1=(int)(Math.random()*((8-0)+1))+0;
            int number2=(int)(Math.random()*((8-0)+1))+0;
            int number3=(int)(Math.random()*((8-0)+1))+0;
            // If the three numbers are equal then add 1 to the total
            if(number1==number2&&number2==number3)
                total++;
            // Output the 3 numbers seperated by a space
            System.out.println(number1+" "+number2+" "+number3);
        }
        // Output the total number of times all three numbers where equal
        System.out.println(total);
    }
}