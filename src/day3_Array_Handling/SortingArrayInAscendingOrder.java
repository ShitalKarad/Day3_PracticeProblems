package day3_Array_Handling;

import java.util.Arrays;

public class SortingArrayInAscendingOrder {
    public static void main(String[] arg) {
        System.out.print("Element of array ");
        int[] sort = {10, 3, 52, 9, 87, 65, 1};
        for (int i = 0; i < sort.length; i++) {
            System.out.print(i + " ");
        }
        Arrays.sort(sort);
        System.out.print("\nElement of array is sorted in ascending order ");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }

    }


}