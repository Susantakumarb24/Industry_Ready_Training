//input-Hello125hai
//output-Hellohai
//       8
import java.util.Scanner;

public class String_Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
               continue;
            }
            else
            {
                s.append(str.charAt(i));
            }
        }
        System.out.println(s+"\n"+s.length());
    }
}