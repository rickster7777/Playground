import java.util.Scanner;
 class Main {

    public static void main(String args[]) {
    //  System.out.println("Enter the number till which prime number to be printed: ");
      Scanner sc = new Scanner(System.in);
      int limit = sc.nextInt();
    
      //printing primer numbers till the limit ( 1 to 100)
  //    System.out.println(limit);
      for(int number = 2; number <= limit; number++){
          //print prime numbers only
          if(isPrime(number)){
              System.out.println(number);
          }
      }

    }

       public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number % i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}
