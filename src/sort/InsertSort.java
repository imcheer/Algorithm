package sort;

public class InsertSort {
	
	public static void main(String[] args) {
		int[] array = {2,51,25,423,22,22,17,85,48,534};
		insertionSort(array);
		for(int i : array){
			System.out.print(i+",");
		}
	}
	
	private static int[] insertionSort(int[] unsortedArray){
		
		for ( int j = 1 ; j < unsortedArray.length ; j++){
			int key = unsortedArray[j];
			int i = j - 1;
			while ( i>=0 && (key > unsortedArray[i] )){
				unsortedArray[i+1] = unsortedArray[i];
				i = i-1;
			}
			unsortedArray[i+1] = key;
		}
		
		return unsortedArray;
	}

}
