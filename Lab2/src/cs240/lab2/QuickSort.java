package cs240.lab2;

public class QuickSort {
	static void swap(int array1[],int i,int j)
    {
        int t = array1[i];
        array1[i] = array1[j];
        array1[j] = t;
    }
    private static int partition (int array1[], int l, int h)
    {
        int x = array1[h];
        int i = (l - 1);
        for (int j = l; j <= h- 1; j++)
        {
            if (array1[j] <= x)
            {
                i++;
                swap(array1,i,j);
            }
        }
        swap(array1,i+1,h);
        return (i + 1);
    }
    public static int[] quickLow(int tempArray[])
    {
    	int h = tempArray.length-1;
    	int l = 0;
        int stack[] = new int[h-l+1];
        int top = -1;
        stack[++top] = l;
        stack[++top] = h;
        while (top >= 0)
        {
            h = stack[top--];
            l = stack[top--];
            int p = partition(tempArray, l, h);
            if ( p-1 > l )
            {
                stack[ ++top ] = l;
                stack[ ++top ] = p - 1;
            }
            if ( p+1 < h )
            {
                stack[ ++top ] = p + 1;
                stack[ ++top ] = h;
            }
       }
       return tempArray;
    }
    public static int[] quickLowRec(int[] array1, int startIdx, int endIdx) {
        int index = partition(array1, startIdx, endIdx);
        if (startIdx < index - 1) {
            quickLowRec(array1, startIdx, index - 1);
        }
        if (endIdx > index) {
            quickLowRec(array1, index, endIdx);
        }
        return array1;
    }
}

