public class LeetCode941 {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int end = arr.length;

        while (i < end -1 && arr[i] < arr[i+1] ){
            i++;
        }
        if(i == 0 || i == end - 1){
            return false;
        }
        while (i < end -1 && arr[i] > arr[i+1]){
            i++;
        }

        if(i == end - 1){
            return true;
        }
        return false;
    }
}
