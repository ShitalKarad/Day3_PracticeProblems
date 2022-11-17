package day3_Array_Handling;

public class DuplicateElementOfArray {
    public static void main(String[] args)
{
    System.out.print("Duplicates are ");
    int[] dup={ 11,21,22,22,11,13,15,1,1,3,3};
    for(int i=0; i<dup.length; i++){
        for(int j=i+1 ;j<dup.length; j++) {
            if (dup[i] == dup[j])
                System.out.println(dup[j]+" ");
        }
    }
}
}