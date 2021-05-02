package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review7{
    public static void main(String[] args) throws IOException{
        String theSentence;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        theSentence=br.readLine();
        System.out.println("There are "+theSentence.length()+" characters in the sentence.");
        System.out.println("There are "+charNum(theSentence," ")+" spaces in the sentence.");
        System.out.println("There are "+charNum(theSentence,"a")+" letter a in the sentence.");
        for(int i=0;i<theSentence.length();i++){
            i++;
            System.out.print("-");
        }
    }
    public static int charNum(String theSentence, String character){
        String check;
        check=theSentence.replaceAll(character, "");
        return theSentence.length()-check.length();
    }
}