/*      7 6 5 4 3 2 1
        6 5 4 3 2 1
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1            */


import java.util.Scanner;
public class NumberPattern8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
