import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
  int digit = n * n;
   return digit;
  }

	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      
      int comp = square(n);
      System.out.println(comp);

      
	} 
}