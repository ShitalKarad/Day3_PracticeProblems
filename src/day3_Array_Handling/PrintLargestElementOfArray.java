package day3_Array_Handling;

public class PrintLargestElementOfArray {
    public static void main(String[] args){
        int[] a = {20,10,5,50,2};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("Largest number is "+max);
    }
}
