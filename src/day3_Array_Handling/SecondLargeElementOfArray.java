package day3_Array_Handling;

public class SecondLargeElementOfArray {
    public static void main(String[] args){
        int[] arr={ 22,23,10,20,4,2,9};
        int max = arr[0];
        int secondMax = arr[1];

        for(int i=0 ;i<arr.length;i++){
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];
            }else if (arr[i]<max && secondMax<arr[i]) {
                secondMax = arr[i];
            }
        }
        System.out.println("my Max Number is "+max +" and my second max is "+secondMax);
    }
}
