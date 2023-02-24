import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to get max and min");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = max(a, b, c);
        int min = min(a, b, c);

        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

    }
    public static int max(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    public static  int min(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
