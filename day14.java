
import java.util.*;

//Scope

class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int [] nums){
        elements = nums;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];
    }

}

public class day14{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}