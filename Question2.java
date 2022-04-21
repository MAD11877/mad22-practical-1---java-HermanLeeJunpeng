import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {    
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your height");
    double height = in.nextDouble();
    System.out.println("Please enter your weight in KG");
    double weight = in.nextDouble();

    double BMI = weight / (height * height);
    System.out.println("Your Bmi is: " + BMI);
  }
}
