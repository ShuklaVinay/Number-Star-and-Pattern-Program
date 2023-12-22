/*      7
        7 6
        7 6 5
        7 6 5 4
        7 6 5 4 3
        7 6 5 4 3 2
        7 6 5 4 3 2 1          */

import java.util.Scanner;
public class NumberPattern5 {
    public static void main(String[] args) {
        int n; //no.of rows
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n.");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
