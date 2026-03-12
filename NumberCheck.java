import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();

            if(a[i] > 0){
                if(a[i] % 2 == 0)
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            }
            else if(a[i] < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        if(a[0] > a[4]) System.out.println("First greater");
        else if(a[0] < a[4]) System.out.println("Last greater");
        else System.out.println("Equal");
    }
}