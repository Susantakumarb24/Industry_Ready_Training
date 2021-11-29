//String_Problem.java
import java.util.LinkedList;
import java.util.Scanner;

public class String_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        LinkedList<Character> list= new LinkedList<>();
        //to store characters in list
        for(int i=str.length()-1;i>=0;i--)
        {
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
            {
                list.add(str.charAt(i));
            }
        }
        //to store special characters in list at specific positions
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
            {
                continue;
            }
            else
            {
                list.add(i,str.charAt(i));
            }
        }
        for(char ch:list)
        {
            System.out.print(ch);
        }
    }
}
