import java.util.*;

//Operators

public class day02{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        double tip = meal_cost*tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        int total_cost = (int)Math.round(meal_cost + tip + tax);
        System.out.println(total_cost);
    }

}

