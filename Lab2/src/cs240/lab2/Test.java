package cs240.lab2;


import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void displayArray(int[] array1){
		for(int i=0; i < array1.length;i++){
			System.out.print(array1[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void reshuffle(int[] array1){
		Random rand = new Random();
		for(int i= 0; i<array1.length; i++){
			array1[i]= rand.nextInt(1000)+1;
		}
	}
	public static int[] createTemp(int[] array1){
		int [] tempArray = new int[array1.length];
		for(int i = 0; i < array1.length; i++){
			tempArray[i]= array1[i];
		}
		return tempArray;
	}
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int array1[]= new int[keyboard.nextInt()];
		System.out.println("Initializing random array....");
		reshuffle(array1);
		System.out.print("Original	: ");
		displayArray(array1);
		System.out.print("Selection Iter	: ");
		displayArray(SelectionSort.selectLow(createTemp(array1)));
		System.out.print("Insert Iter	: ");
		displayArray(InsertionSort.insertLow(createTemp(array1)));
		System.out.print("Shell Iter	: ");
		displayArray(ShellSort.sortLow(createTemp(array1)));
		System.out.print("Merge Iter	: ");
		displayArray(MergeSort.mergeLow(createTemp(array1)));
		System.out.print("Quick Iter	: ");
		displayArray(QuickSort.quickLow(createTemp(array1)));
		System.out.print("Radix Iter	: ");
		displayArray(RadixSort.radixLow(createTemp(array1)));
		System.out.print("Selection Rec	: ");
		displayArray(SelectionSort.selectLowRec(createTemp(array1), 0));
		System.out.print("Insert Rec	: ");
		displayArray(InsertionSort.insertLowRec(createTemp(array1), 1,0,-1));
		System.out.print("Merge Rec	: ");
		displayArray(MergeSort.mergeLowRec(createTemp(array1)));
		System.out.print("Quick Rec	: ");
		displayArray(QuickSort.quickLowRec(createTemp(array1), 0, array1.length-1));
		System.out.print("Radix Rec	: ");
		displayArray(RadixSort.radixLowRec(createTemp(array1), 1));
		System.out.print("Shell Rec	: ");
		displayArray(ShellSort.sortLowRec(createTemp(array1), 4,0));
		System.out.print("Original Again	: ");
		displayArray(array1);

	}
}
