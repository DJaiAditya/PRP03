import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, count = 0;

        // count digits
        while(temp != 0){
            count++;
            temp /= 10;
        }

        int digits[] = new int[count];
        int freq[] = new int[10];

        temp = num;

        // store digits
        for(int i = count-1; i >= 0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }

        // calculate frequency
        for(int i = 0; i < count; i++){
            freq[digits[i]]++;
        }

        // display frequency
        for(int i = 0; i < 10; i++){
            if(freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
    }
}