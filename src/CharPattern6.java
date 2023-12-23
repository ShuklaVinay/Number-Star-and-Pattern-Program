/*       A
        A B
       A B C
      A B C D
     A B C D E
    A B C D E F
   A B C D E F G     */


import java.util.Scanner;
public class CharPattern6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n = sc.nextInt();
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
