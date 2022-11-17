package day3_Array_Handling;

public class PrintSmallestElementInArray {
    public static void main(String[] args){
        int[] b = { 50,70,40,30,20,5,10};
        int min = b[0];
        for(int i=1;i<b.length;i++){
            if(b[i]<min)
                min = b[i];
        }
        System.out.println("Smallest number is "+min);
    }
}
