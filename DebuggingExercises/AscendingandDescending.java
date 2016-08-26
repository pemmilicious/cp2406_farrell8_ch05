/**
 * Created by Bradley on 26/08/2016.
 */
public class AscendingandDescending {
    public static void main(String args[]) {
        int num1 = 17;
        int num2 = 3;
        int num3 = 14
        int low, high;

        {
            low = num1;
            if(num2 <= num1)
            {
                low = num2;
                high = num1;
            }
            else
            {
                low = num1;
                high = num2;
            }
        }
        {
            high = num3        }
        System.out.println(low);
        System.out.println(high);

    }
}
