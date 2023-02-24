import java.util.Scanner;

public class _2dArray {

    //finding the element in 2d array
    public static boolean Search(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                if(arr[i][j] == key){
                    System.out.println("Element found at " + i + j);
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    //find the greatest element in array
    public static int Greatest(int arr[][]){
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(big < arr[i][j]){
                    big = arr[i][j];
                }
            }
        }
        return big;
    }

    public static void main(String[] args) {
        // creating a 2d array

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Enter the key to find in array");
        int key = sc.nextInt();
        Search(matrix, key);
        System.out.println("The greatest element in array is "+ Greatest(matrix));
    }
}
