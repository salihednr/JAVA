import java.util.Scanner;
public class PrimeTest{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        boolean prime=true;
        for(int i=3;i<=num/2;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
        System.out.println("Given Number Is Prime");
        else
        System.out.println("Given Number Is Not Prime");
    }
}
/*
Method -1 Not Optimised
import java.util.Scanner;
public class PrimeTest{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int f=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            f++;
        }
        if(f==2)
        System.out.println("Given Number Is Prime");
        else
        System.out.println("Given Number Is Not Prime");
    }
}
 */



