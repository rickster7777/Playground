import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = 1;
	     for(int i = 1; temp <= n ; i++)
         {
           if (i % 2 == 1)
           {
          System.out.println(i);
             temp++;
           }
         }
	}
}