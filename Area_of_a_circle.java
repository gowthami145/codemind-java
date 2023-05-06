import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int r;
    float area;
    r=sc.nextInt();
    float pi=3.14f;
    area=pi*r*r;
    System.out.printf("%.2f",area);
}
}