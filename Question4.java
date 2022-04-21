import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
     int rows, i, j;
     System.out.print("Input number of rows: ");

    Scanner in = new Scanner(System.in);
    rows = in.nextInt();

    for (i=rows; i> 0; i--) 
    {
      for (j=0;j<i;j++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }    
  }
}
