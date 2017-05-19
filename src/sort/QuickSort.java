package sort;

import java.awt.RenderingHints.Key;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {2,51,25,423,22,22,17,85,48,534};
		quickSort(array, 0, 9);
		for(int a : array){
			System.out.print(a+",");
		}
	}
	
	
	private static void quickSort(int[] array,int p,int r){
		int q=0;
		if (p<r) {
			q=partition(array, p, r);
			quickSort(array, p, q-1);
			quickSort(array, q+1, r);
		}
	}
	private static int partition(int[] array,int p ,int r){
		int i = p;
		int key = array[r];
		int temp = 0;
		for ( int j=p;j<r;j++){
			if (array[j]<key) {
				
				temp = array[j];
				array[j]=array[i];
				array[i]=temp;
				i = i+1;
			}
		}
		int temp2 = array[r];
		array[r] = array[i];
		array[i] = temp2;
		return i;
		
	}
	 
}
