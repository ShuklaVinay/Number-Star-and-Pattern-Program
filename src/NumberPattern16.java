/*              1234567
                 234567
                  34567
                   4567
                    567
                     67
                      7
                     67
                    567
                   4567
                  34567
                 234567
                1234567                     */

import java.util.Scanner;
public class NumberPattern16 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
