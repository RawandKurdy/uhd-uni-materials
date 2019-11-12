public class Sequential{
    int sequential(int num, int[] arr){

        for (int i=0; i<arr.length; i++){
            System.out.println("Searched Keys: "+ i);
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Sequential ob = new Sequential();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int num = -10;

        System.out.println(ob.sequential(num, arr));
    }
}