

public class Punto1 {
    public static int[] insertionSort (int[] array){
        int j=0;
        int temp=0;
        for(int i=0;i<array.length;i++){
            j = i;
           temp = array[j];
            while(j > 0 && array[j- 1 ] > temp){
                array[j] = array[j-1];
                j-- ;
            }
            array[j] = temp;
        }
        return array;
    }
}