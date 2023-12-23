/*      Z
        Z Y
        Z Y X
        Z Y X W
        Z Y X W V
        Z Y X W V U
        Z Y X W V U T       */


import java.util.Scanner;
public class CharPattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            char ch='Z';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
