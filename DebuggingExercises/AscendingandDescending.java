/**
 * Created by Bradley on 26/08/2016.
 */
public class AscendingandDescending {
    public static void main(String args[]) {
        int num1 = 12;
        int num2 = 18;
        int num3 = 15;
        int low, med, high;
        if(num1 <= num2 && num1 <= num3)
        {
            low = num1;
            if(num2 <= num3)
            {
                med = num2;
                high = num3;
            }
            else
            {
                med = num3;
                high = num2;
            }
        }
        else
        {
            if(num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if(num1 <= num3)
                {
                    med = num1;
                    high = num3;
                }
                else
                {
                    med = num3;
                    high = num1;
                }
            }
            else
            {
                low = num3;
                if(num1 <= num2)
                {
                    med = num1;
                    high = num2;
                }
                else
                {
                    med = num2;
                    high = num1;
                }
            }
        }
            System.out.println(low);
            System.out.println(med);
            System.out.println(high);

        }
    }
