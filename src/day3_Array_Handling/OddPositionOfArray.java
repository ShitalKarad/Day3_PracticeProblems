package day3_Array_Handling;

public class OddPositionOfArray {
    public static void main(String[] args){
        int[] odd = {10,30,50,90,5,3,40};
        System.out.println("Elements of odd positions are ");
        for(int i=1;i<odd.length;i++){
            if(odd[i] % 2 != 0);
            System.out.println(odd[i]);
        }

    }
}
