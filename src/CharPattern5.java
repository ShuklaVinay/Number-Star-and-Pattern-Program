/*      G F E D C B A
        G F E D C B
        G F E D C
        G F E D
        G F E
        G F
        G             */

import java.util.Scanner;
public class CharPattern5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        char ch;
        for(int i=n;i>=1;i--)
        {
            ch='G';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
