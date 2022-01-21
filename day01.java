import java.util.Scanner;

public class day01 {

    public static void main(String[] args)
    {
        int i = 2,x;
        double d=2.0,y;
        String s="hello",z;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();
        System.out.println(i+x);
        System.out.println(d+y);
        System.out.println(s + z);
    }


}
