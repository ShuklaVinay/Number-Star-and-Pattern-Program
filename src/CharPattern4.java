/*      A B C D E F G
        A B C D E F
        A B C D E
        A B C D
        A B C
        A B
        A             */

import java.util.Scanner;
public class CharPattern4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
