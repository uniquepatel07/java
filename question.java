import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isArmstrong(152));
        System.out.println(sums(4,7));
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 4;

        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("" + a + " " + b);
        System.out.println(product(5,8));
        System.out.println("factorial of any number is " + factorial(7));

        printPrime(15);
    }

    // multiply
    public static int product(int a, int b){
        return a*b;
    }
    //factorial of a number
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        return f;
    }

    // print all prime in range

    public static void printPrime(int n){
        for (int i = 2; i < n ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }

        }
    }

    //is prime number or not;;;;
    static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        for (int i = 2; i <n ; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    // is armstrong or not ;;;

    static boolean isArmstrong(int a){
        int original = a;
        int sum = 0;
        while (a>0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }

    //sum of two numbers
    public static int sums(int a , int b){
        int add = a+b;
        return add;
    }
}
