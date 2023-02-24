public class reverseArray {

    public static void reverse(int arr[]){
        int s = 0, e= arr.length-1;
        while (s<e){

            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 5, 7, 8};
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }

    }
}
