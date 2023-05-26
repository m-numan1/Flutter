
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {//a program t check whether a given string an anagram
    public boolean check(String str1,String str2){//it's a check method to look whether strings are anagram
        char[] char1= str1.toLowerCase().toCharArray();
        //converting strings to lower case and then storing in char array
        char []char2= str2.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);//sorting an array
        boolean anagram=false;
        if (Arrays.equals(char1,char2))
        {
            anagram=true;
            return anagram;
        }
        else{
            return anagram;
        }
    }
}
class SeeResult{
    public static void main(String[] args) {//main method
        String str1;
        String str2;
        Scanner input=new Scanner(System.in);
        AnagramStrings anagram=new AnagramStrings();
        System.out.println("Enter String 1");
        str1=input.nextLine();
        System.out.println("Input string 2");
        str2=input.nextLine();
        int count=str1.length();//finding out length of string
        if(count==str2.length()){//comparing string length if its equal then look for an anagram
            System.out.println(anagram.check(str1,str2));
        }
        else {
            System.out.println("Not Anagram");
        }
    }

}
