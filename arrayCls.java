import java.util.*;
public class arrayCls {

    public static void update(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    // Linear Search
    public static int linearSearch(int arr[], int key){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    // get largest value
    public static int getLargetst(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {

//         int marks[] = {78, 99, 45};
//
//         update(marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//
//        }
//
//        int numbers[] = {3, 2, 1, 5, 3, 10, 2, 44, 5};
//        int key = 20;
//
//        int index = linearSearch(numbers, key);
//        if(index == -1){
//            System.out.println("not found");
//        }else {
//            System.out.println("found at index : " + index);
//        }

        int number[] = {1, 2, 3, 6, 4, 5};

        System.out.println("largest value is : " +getLargetst(number));


    }
}
