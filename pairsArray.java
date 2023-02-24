public class pairsArray {

    public static void pairsArrays(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(" " + arr[i] +" "+arr[j]);
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs are : " +tp);
    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 7};
        pairsArrays(number);
    }
}
