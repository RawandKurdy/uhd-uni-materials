
public class Binary {

    int binarySearch(int num, int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = (high+low)/2;

        while(low<=high){
            System.out.println("Searched Keys: "+ mid);
            if (arr[mid] == num){
                return mid;
            } else if(arr[mid]<num){
                low = mid+1;
                mid = (high+low)/2;
            } else if(arr[mid]>num){
                high = mid-1;
                mid = (high+low)/2;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Binary obj = new Binary();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int num = -10;

        System.out.println("Found: "+obj.binarySearch(num, arr));
    }
}