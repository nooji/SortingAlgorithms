package cs240.lab2;


public class InsertionSort {
	public static int[] insertLow(int[] tempArray){
		for(int i = 1; i < tempArray.length;i++){
			int j=i-1;
			while(j>=0 &&(tempArray[j+1]<tempArray[j])){
				int temp = tempArray[j+1];
				tempArray[j+1]=tempArray[j];
				tempArray[j]=temp;
				j-=1;
			}
		}
		return tempArray;
	}
	
	
	public static int[] insertLowRec(int[] array1, int unsortedIndex, int key, int sortedIndex){
		if(unsortedIndex <= array1.length){
			if(sortedIndex == -1 && key == 0 ){
				if(unsortedIndex != array1.length)
					insertLowRec(array1, unsortedIndex +1,array1[unsortedIndex],unsortedIndex-1);
			}
			else{
				if(sortedIndex == -1 || array1[sortedIndex] < key){
					array1[sortedIndex+1] = key;
					sortedIndex = 0;
					key = 0;
				}
				else{
					array1[sortedIndex+1] = array1[sortedIndex];
				}
				insertLowRec(array1,unsortedIndex,key,sortedIndex - 1);
				
			}
						
		}
		return array1;
	}

}
