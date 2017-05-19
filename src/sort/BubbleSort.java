package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {2,51,25,423,22,22,17,85,48,534};
		bubbleSort(array);
		for(int i : array){
			System.out.print(i+",");
		}
	}
	
	private static int[] bubbleSort(int[] unsortedArray){
		
		int temp = 0;
		for (int i = unsortedArray.length-1; i>0 ; i--){
			for (int j=0 ; j < i ;j++){
				if (unsortedArray[j]<unsortedArray[j+1]) {
					temp = unsortedArray[j+1];
					unsortedArray[j+1] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		
		return unsortedArray;
	}
}
