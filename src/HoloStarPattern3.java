/*      * * * * * * * *
        *             *
        *             *
        *             *
        *             *
        *             *
        *             *
        * * * * * * * *        */

import java.util.Scanner;
public class HoloStarPattern3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
