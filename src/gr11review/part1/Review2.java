package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review2{
    public static void main(String[] args) throws IOException{
        int menuOption;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("0 - print an joke about your hair\n1 - print a joke about your feet\n2 - print a joke about your clothes\n3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        menuOption = Integer.parseInt(br.readLine());
        switch(menuOption){
            case 0 : 
            System.out.println("Why do bees have sticky hair?");
            System.out.println("They always use honeycombs.");
            break;
            case 1 : 
            System.out.println("Joke about feet");
            System.out.println("punch line");
            break;
            case 2 : 
            System.out.println("Joke about clothes");
            System.out.println("punch line");
            break;
            case 3 : 
            System.out.println("Joke about teacher");
            System.out.println("punch line");
            break;
            default : 
            System.out.println("Invalid menu option");
            break;
        }
    }   
}