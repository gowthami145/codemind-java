import java.util.*;
import java.lang.*;
import java.io.*;
public class MONOPOLY
{
    public static void main(String[]args)throws java.lang.Exception
    {
        Scanner obj=new
        Scanner(System.in);
        int t=obj.nextInt();
        while(t>0)
        {
            int r1=obj.nextInt();
            int r2=obj.nextInt();
            int r3=obj.nextInt();
            if(r1>(r2+r3)||r2>(r1+r3)||r3>(r1+r2))
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
                
            }
            t--;
            
        }
    }
}