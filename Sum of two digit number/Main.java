import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int first = n / 10;
      int sec = n % 10;
      int avg = (first + sec) ;
      
      System.out.println(avg);
      
	}
}