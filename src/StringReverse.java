import java.util.Scanner;
public class StringReverse {//This is a simple program to revserse string without using build in function
    public  void reverse(String str, int b)
    {
        for(int i=b; i>0;i--){//this will traverse through string and will change it into char
            System.out.print(str.charAt(i-1));
        }
    }
}
class Main{//this class contain main method
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//object to take user input

        String arr;
        StringReverse rev=new StringReverse();//create object of a class
        int count;
        arr=input.nextLine();//taking string from user input
        count = arr.length();//finding length of string
        rev.reverse(arr,count);

    }
}

