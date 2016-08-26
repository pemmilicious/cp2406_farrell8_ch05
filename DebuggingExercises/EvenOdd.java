import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Bradley on 26/08/2016.
 */
import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");


    }
}