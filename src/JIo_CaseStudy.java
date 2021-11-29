//Jio_Case_Study
import java.util.Scanner;

public class JIo_CaseStudy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int validity=84,msg=100,call=3000,used_call,days,used_msg;
        float data=2.0f,used_data;
        System.out.println("Enter days : ");
        days=sc.nextInt();
        if (days>=validity)
        {
            System.out.println("Plan expired..");
            System.exit(0);
        }
        else
        {
            System.out.println(validity-days+" days are left");
        }
        System.out.println("Enter number of msg used(out of 100) : ");
        used_msg=sc.nextInt();
        String show=(used_msg>msg)?"msg could not be sent":"you have "+(msg-used_msg)+" msgs left";
        System.out.println(show);
        System.out.println("Enter data used in GB : ");
        used_data=sc.nextFloat();
        if(used_data>data)
        {
            System.out.print("Quota data exhausted,speed reduced to 64kpps");
        }
        else
        {
            System.out.printf("you have %.1f GB data left\n",(data-used_data));
        }
        System.out.println("Enter number of calls used(out of 3000) : ");
        used_call=sc.nextInt();
        sc.close();
        show=(used_call>call)?"call could not be connected..":"you have "+(call-used_call)+" calls left";
        System.out.println(show);
    }
}
