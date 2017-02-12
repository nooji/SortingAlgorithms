package cs240.lab2;

public class SelectionSort{
	public static int[] selectLow(int[] tempArray)
	{
	    for(int i=0; i < tempArray.length-1; i++){
	    	int temp =i;
	    	for(int j = i+1; j <tempArray.length;j++){
	    		if(tempArray[j] < tempArray[temp]){
	    			  temp = j;
	    		}
	    	}
	    	int numba = tempArray[temp];
    		tempArray[temp] = tempArray[i];
    		tempArray[i] = numba;
	    }
	    return tempArray; 
	}	
	
	public static int[] selectLowRec(int[] array1, int index)
	{	
	
		if(index <= array1.length-1){
			int temp = index;
			for(int i = index+1; i <array1.length;i++){
				if(array1[i] < array1[temp]){
					temp = i;
				}
			}
			int tempNum = array1[index];
			array1[index] = array1[temp];
			array1[temp]= tempNum;
			selectLowRec(array1,index+1);
		}
		return array1;
	}

}