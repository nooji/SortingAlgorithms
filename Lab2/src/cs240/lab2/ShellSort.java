package cs240.lab2;

public class ShellSort {
	public static int[] shellLow(int[] tempArray) {
	    int inner, outer;
	    int temp;
	    int interval = 1;
	    while (interval > 0) {
	      for (outer = interval; outer < tempArray.length; outer++) {
	        temp = tempArray[outer];
	        inner = outer;
	 
	        while (inner >interval- 1 && tempArray[inner - interval] >= temp) {
	          tempArray[inner] = tempArray[inner - interval];
	          inner -= interval;
	        }
	        tempArray[inner] = temp;
	      }
	      interval= (2*interval)+1;
	    }
	    return tempArray;
	  }
	public static int[] shellLowRec(int[] array1, int interval) {
		int inner, temp,outer;
		if(interval >0){
			for(outer = interval;outer<array1.length;outer++){
				temp = array1[outer];
				inner = outer;
				while(inner > interval-1 && array1[inner-interval] >= temp){
					array1[inner]= array1[inner -interval];
					inner-=interval;
				}
				array1[inner]= temp;
			}
			shellLowRec(array1, (interval*2)+1);
		}
		return array1;
	}   
	  
}
