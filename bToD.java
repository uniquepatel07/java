import java.util.Scanner;

public class bToD {
    public static void main(String[] args) {

        binToDes(1001);

    }

    public static void binToDes(int n){
        int pow = 0;
        int des = 0;
        while (n>0){
            int lastdig = n %10;
            des = des + (lastdig* (int) Math.pow(2, pow));
            pow++;
            n = n/10;


        }
        System.out.println("desimal number is " + des);
    }
}
