public class printSubArrays {

    public static void printSubArrays(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum+=arr[k];
                    System.out.print(arr[k] + " ");

                }
                if(maxSum< currentSum){
                    maxSum = currentSum;
                }
                System.out.print(" = "+currentSum);
                ts++;
                System.out.println();

            }


        }
        System.out.println("Total Sub arrys are: " +ts);
        System.out.println("Your maximum Sum is: " + maxSum);
    }

    public static void main(String[] args) {

        int number[] = {2, 3, 5, 8, 10};
        printSubArrays(number);

    }
}
