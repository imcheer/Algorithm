package sort;

public class selectionSort {
	
	public static void main(String[] args) {
		int[] array = {2,51,25,423,21,22,17,85,48,534};
		selectionSort(array);
		
	}
	
	private static int[] selectionSort(int[] unsortedArray){
		for(int i=0;i<unsortedArray.length-1;i++){
			for(int j=i;j<unsortedArray.length;j++){
				if (unsortedArray[i]<unsortedArray[j]) {
					int temp = unsortedArray[i];
					unsortedArray[i] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		
		return unsortedArray;
	}

}
