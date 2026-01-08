import java.util.Scanner;

public class ceilingBinarySearch { //return smallest number >= target
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] timing = new int[10];
        System.out.print("Enter All Bus Timing: ");
        for (int i = 0; i < timing.length; i++) {
            timing[i] = in.nextInt();
        }
        System.out.print("Enter Arrival Time: ");
        int target = in.nextInt();

        int res = ceilingBS(timing, target);
        if(res == -1){
            System.out.printf("No Bus Avaiable in Given Time");
        }
        else {
            System.out.printf("Take " + timing[res] + " timing bus");
        }
    }

    static int ceilingBS(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        boolean isAsc = arr[0] < arr[arr.length-1];
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2 ;

            if(arr[mid] == target){
                return mid;
            }


            if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return start;
    }
}
