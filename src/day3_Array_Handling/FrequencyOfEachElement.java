package day3_Array_Handling;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        System.out.println("Frequency of each element is ");
        int[] arr = {11, 12, 8, 3, 3, 2, 5, 7, 8, 8, 7, 5, 8, 8, 11, 11, 3, 3};
        boolean[] visitedArr = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
           if( visitedArr[i]==false) {
               for (int j = i + 1; j < arr.length; j++) {
                   if (arr[i] == arr[j]) {
                       temp++;
                       visitedArr[j] = true;
                   }
               }
           }
           if(visitedArr[i]==false)
            System.out.println(arr[i]+ "----"+temp);
        }
    }
}



