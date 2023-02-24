public class spiralMatrix {

    //Print the spiral matrix;;
    public static void printMatrix(int arr[][]){
        int startR=0;
        int endR=arr.length-1;
        int startC=0;
        int endC= arr.length-1;

        while (startC<=endC && startR<=endR){
            //print top part
            for (int j = startC; j <=endC ; j++) {
                System.out.print(arr[startR][j]+" ");
            }
            //print right part
            for (int i = startR+1; i <=endR ; i++) {
                System.out.print(arr[i][endC]+ " ");
            }
            //print bottom part
            for (int j = endC-1; j >=startC ; j--) {
                System.out.print(arr[endR][j]+ " ");
            }
            //print left part
            for (int i = endR-1; i >=startR+1 ; i--) {
                System.out.print(arr[i][startC] + " ");
            }
            startR++;
            startC++;
            endC--;
            endR--;
        }
        System.out.println();
    }


    //diagonal Sum of 2d Matrix;;
    public static int diagonalSum(int arr[][]){
        int sum =0;

        //Brut force it take time big o of n2;


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if(i == j){
//                    sum+=arr[i][j];
//                }
//                else if (i+j ==arr.length-1){
//                    sum+=arr[i][j];
//                }
//            }
//        }
//        return sum;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int matrix[][] =
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
//        printMatrix(matrix);
        System.out.println(diagonalSum(matrix));
    }
}
