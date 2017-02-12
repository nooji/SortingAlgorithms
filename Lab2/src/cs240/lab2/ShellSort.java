package cs240.lab2;

public class ShellSort {
	public static int[] sortLow(int[] tempArray) {
	    int inner, outer;
	    int temp;
	    int interval = 1;
	    while (interval<= tempArray.length / 3) {
	    	interval=interval* 3 + 1;
	    }
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
	      interval= (interval - 1) / 3;
	    }
	    return tempArray;
	  }
	public static int[] sortLowRec(int[] array1, int interval, int increment) {
		int inner, temp,outer;
		if(increment==0){
			while(interval <= array1.length/3){
				interval = interval*3 +1;
			}
			increment++;
		}
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
			sortLowRec(array1, (interval-1)/3,increment);
			
		}
		return array1;
	}   
	  
}
