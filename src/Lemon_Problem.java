//Lemon_Problem.java
import java.util.Scanner;

public class Lemon_Problem {
    static int lemon_available;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //3 Gods nad 7 lemons per head.total 21 lemons needed
        //byte god=3;
        byte lemon_required=21;
        System.out.println("Enter how many lemons you have : ");
        String lemon_available1=sc.next();
        try{
            lemon_available=Integer.parseInt(lemon_available1);
            if(lemon_available<0)
                throw new Exception();
            String result=(lemon_available > lemon_required)?"You have extra " + (lemon_available - lemon_required) + " lemons":(lemon_available < lemon_required)?"You  need " + (lemon_required - lemon_available) + " more lemons":"OK";
            System.out.println(result);
        }catch(Exception e)
        {
            System.out.println("Invalid Choice...try again");
            Lemon_Problem.main(null);
        }
    }
}
