import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int first = n / 100;
      int third = n % 10;
      
      System.out.println(first + third);
      
	}
}