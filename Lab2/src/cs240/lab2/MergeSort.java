package cs240.lab2;

public class MergeSort {
	 public static int[] mergeLow(int[] tempArray) {
	    int[] from = tempArray, to = new int[tempArray.length];
	    for (int blockSize=1; blockSize<tempArray.length; blockSize*=2) {
	       for (int start=0; start<tempArray.length; start+=2*blockSize)
	          mergeWithoutCopy(from, to, start, start+blockSize, start+2*blockSize);
	       int[] temp = from;
	         from = to;
	         to = temp;
	    }
	    if (tempArray != from){
	       for (int k = 0; k < tempArray.length; k++)
	         tempArray[k] = from[k];
	    }
	    return tempArray;
	 }
	 private static void mergeWithoutCopy(int[] from, int[] to, int lo, int mid, int hi) {
	    if (mid > from.length) mid = from.length;
	    if (hi > from.length) hi = from.length;
	    int i = lo, j = mid;
	    for (int k = lo; k < hi; k++) {
	    	if      (i == mid)          
	    		to[k] = from[j++];
	        else if (j == hi)           
	        	to[k] = from[i++];
	        else if (from[j] < from[i]) 
	        	to[k] = from[j++];
	        else                        
	        	to[k] = from[i++];
	    }
	 }
	 public static int[] mergeLowRec(int[] elts) {
	        if(elts.length > 1) {
	            int[] first = extract(elts, 0, elts.length / 2);
	            int[] last = extract(elts, elts.length / 2, elts.length);
	            mergeLowRec(first);
	            mergeLowRec(last);
	            merge(elts, first, last);
	        }
	        return elts;
	    }
	    private static int[] extract(int[] elts, int start, int last) {
	        int[] ret = new int[last - start];
	        for(int i = 0; i < ret.length; i++) ret[i] = elts[start + i];
	        return ret;
	    }
	    private static void merge(int[] dest, int[] a, int[] b) {
	        int i = 0;
	        int j = 0;
	        while(i < a.length && j < b.length) {
	            if(a[i] < b[j]) {
	                dest[i + j] = a[i];
	                ++i;
	            } else {
	                dest[i + j] = b[j];
	                ++j;
	            }
	        }
	        for(; i < a.length; i++) dest[i + j] = a[i];
	        for(; j < b.length; j++) dest[i + j] = b[j];
	    }
	 
}