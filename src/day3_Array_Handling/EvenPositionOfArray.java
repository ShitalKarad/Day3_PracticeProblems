package day3_Array_Handling;

public class EvenPositionOfArray {
    public static void main(String[] args){
        int[] even = { 1,2,4,5,7,9,3,10};
        System.out.println("Elements of even positions are ");
        for(int i=1;i<even.length;i++){
            if(i%2==0)
                System.out.println(even[i]);
        }
    }
}
