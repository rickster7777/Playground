import java.util.Scanner;
class Main{
  
  public static int f(int n)
  {
    int sum = 0;
   for(int i= 1 ; i <= n ; ++i)
  {
        sum = sum + i;
     //   return sum;
  }
  return sum;
  }

	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int comp = f(n);
        System.out.println(comp);
	}
}