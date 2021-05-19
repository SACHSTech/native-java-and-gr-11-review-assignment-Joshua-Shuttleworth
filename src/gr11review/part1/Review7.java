package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Create a program that will input a sentence from the user and store it in a String variable called
* theSentence. Use the String methods to compute the following about the sentence. Stats about the sentence:
* @author: J. Shuttleworth
*/

public class Review7{
    // "Throws IOException" for BufferedReader
    public static void main(String[] args) throws IOException{
        // Varible declorations
        String theSentence;
        // Defining BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Getting input and storing in varible
        theSentence=br.readLine();
        // Outputting to terminal
        System.out.println("There are "+theSentence.length()+" characters in the sentence.");
        System.out.println("There are "+charNum(theSentence," ")+" spaces in the sentence.");
        System.out.println("There are "+charNum(theSentence,"a")+" letter a in the sentence.");
        // Output the character '-' for each odd number
        for(int i=0;i<theSentence.length();i++){
            i++;
            System.out.print("-");
        }
    }
    // Method to get the number of a specified character
    public static int charNum(String theSentence, String character){
        String check;
        // Removes all of a specific character
        check=theSentence.replaceAll(character, "");
        // Returns length of string subtract the length of the string missing the specified characters
        return theSentence.length()-check.length();
    }
}