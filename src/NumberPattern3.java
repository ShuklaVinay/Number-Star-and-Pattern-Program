  /*    1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6
        7 7 7 7 7 7 7      */

import java.util.Scanner;
  public class NumberPattern3 {
    public static void main(String[] args) {
      int n;    //no. of row
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n(no. of rows):");
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          System.out.print(i+" ");
        }
        System.out.println();
      }
    }
}
