import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        arr[0][0] = "Hello";
        arr[0][1] = "World!";
        arr[1][0] = "Hello";
        arr[1][1] = "Guys!";
        System.out.println("Arr output is:");
        for(int x = 0; x<arr.length;x++)
        System.out.println(Arrays.toString(arr[x]));

        String[][] arr2 = {
         {"Hello", "World!"},
         {"Hello", "Guys!"}};
        System.out.println("Arr2 output is:");
        for(int x = 0; x<arr2.length;x++)
        System.out.println(Arrays.toString(arr[x]));

        int[][] nums = {
            {22,66,88},
            {33,55,77},
            {11,44,99}
        };
        printType(nums);
        printSumOfDiagonal(nums);
        printSumOfRevDiagonal(nums);
    }

    /**
     * Prints out the sum of the diagonal of the array
     * @param arr the Integer multi dimensional array
     */
    public static void printSumOfDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal is: " +sum);
    }

        /**
     * Prints out the sum of the  Reverse diagonal of the array
     * @param arr the Integer multi dimensional array
     */
    public static void printSumOfRevDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i + j == arr.length-1){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("Sum of Rev. Diagonal is: " +sum);
    }

    /**
     * Prints out if a number is even or odd
     * @param arr the Integer multi dimensional array
     */
    public static void printType(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    System.out.println("("+ arr[i][j] +") Number at Index arr["+
                    i+"]["+j+"] is Even"
                    );
                } else {
                    System.out.println("("+ arr[i][j] +") Number at Index arr["+
                    i+"]["+j+"] is Odd"
                    );
                }
            }
        }
    }
}