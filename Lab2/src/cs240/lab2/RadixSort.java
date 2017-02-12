package cs240.lab2;

import java.util.Arrays;

public class RadixSort {
	private static int getMax(int array1[], int n){
		int numMax = array1[0];
        for (int i = 1; i < n; i++){
            if (array1[i] > numMax){
                numMax = array1[i];
            }    
        }    
        return numMax;
    }
    private static void countSort(int array1[], int n, int exp)
    {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
        for (i = 0; i < n; i++)
            count[ (array1[i]/exp)%10 ]++;
        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
        for (i = n - 1; i >= 0; i--){
            output[count[ (array1[i]/exp)%10 ] - 1] = array1[i];
            count[ (array1[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++){
            array1[i] = output[i];
        }
    }
    public static int[] radixLow(int tempArray[]){
    	int n = tempArray.length;
        int m = getMax(tempArray, n);
        for (int exp = 1; m/exp > 0; exp *= 10){
            countSort(tempArray, n, exp);
        }
        return tempArray;
    }
    public static int[] radixLowRec(int array1[], int exp){
    	int n = array1.length;
    	
        int m = getMax(array1, n);
        if(m/exp >0){
            countSort(array1, n, exp);
        	exp*=10;
        	radixLowRec(array1,exp);
        }
        return array1;
    }
}
