 /*     1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1                     */
import java.util.Scanner;
public class NumberPattern2 {
    public static void main(String[] args) {
        int n; //n=no. of rows
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n(no. of rows):");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
