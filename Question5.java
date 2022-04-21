import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    int UserInput, IndividualNum;
    int maxcount = 0;
    int maxvalue = 0;

    ArrayList<Integer> array = new ArrayList<>();
    System.out.println("Please enter the iterations of number to input"); 
    Scanner in = new Scanner(System.in);
    UserInput = in.nextInt();

    for(int i = 0; i < UserInput; i++)
      {
        System.out.print("Enter a number: ");
        IndividualNum = in.nextInt();
        array.add(IndividualNum);
      }

      int ArraySize = array.size();
      int mode[] = new int[ArraySize];
      for (int i =0; i < mode.length; i++)
      {
        int currentvalue = mode[i];
        int currentcount = 1;

        for (int j = i + 1; j < mode.length; ++j)
          {
            ++currentcount;
          }

        if (currentcount > maxcount)
        {
          maxcount = currentcount;
          maxvalue = currentvalue;
        }
        else if (currentcount == maxcount)
          {
            maxvalue = maxvalue;
          }
      }  
      System.out.println("mode: " + maxvalue);
  }
}
