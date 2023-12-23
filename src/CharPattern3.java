/*      A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        G G G G G G G   */


import java.util.Scanner;
public class CharPattern3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");

            }
            ch++;
            System.out.println();
        }
    }
}
