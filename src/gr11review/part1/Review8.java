package gr11review.part1;

public class Review8{
    public static void main(String[] args){
        int total=0;
        for(int i=0;i<1000;i++){
            int number1=(int)(Math.random()*((8-0)+1))+0;
            int number2=(int)(Math.random()*((8-0)+1))+0;
            int number3=(int)(Math.random()*((8-0)+1))+0;
            if(number1==number2&&number2==number3)
                total++;
            System.out.println(number1+" "+number2+" "+number3);
        }
        System.out.println(total);
    }
}