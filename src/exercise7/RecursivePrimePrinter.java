package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
      for (int i=n;n>0;n--)
        {
            if (isPrime(n)==false)
            {
                System.out.println(n);
            }

       
      }
    }

    public static boolean isPrime(int n) {
        boolean result=true;

        for (int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                result=false;
            }
        }
        return result;
    }
}
