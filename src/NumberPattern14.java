/*               1
               2 1
             3 2 1
           4 3 2 1
         5 4 3 2 1
       6 5 4 3 2 1
     7 6 5 4 3 2 1         */


import java.util.Scanner;
public class NumberPattern14 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
