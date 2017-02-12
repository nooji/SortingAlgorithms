package cs240.lab2;


public class InsertionSort {
	public static int countMove = 0;
	public static int countCompare = 0;
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
	
	
	public static int[] insertLowRec(int[] tempArray, int key){
		if(key<tempArray.length){
			int j=key-1;
			while(j>=0 &&(tempArray[j+1]<tempArray[j])){
				int temp = tempArray[j+1];
				tempArray[j+1]=tempArray[j];
				tempArray[j]=temp;
				j-=1;
			}
			insertLowRec(tempArray,key+1);
		}
		return tempArray;
	}

}
