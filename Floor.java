import java.util.Scanner;

public class Floor {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] floor = new int[10];
        System.out.print("Enter all Floors: ");
        for (int i = 0; i < floor.length; i++) {
            floor[i] = in.nextInt();
        }
        System.out.print("Enter Floor no to go:");
        int target = in.nextInt();
        int res = floorToGo(floor, target);
        if(res == -1){
            System.out.print("Invalid Floor entered");
        }else {
            System.out.printf("Floor possible to go: " + floor[res]);
        }
    }

    static int floorToGo(int[] floor, int target){
        if(target < floor[0]){
            return -1;
        }
        int start = 0;
        int end = floor.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < floor[mid]){
                end = mid - 1;
            }
            else if (target > floor[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
