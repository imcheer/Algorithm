package sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = {2,51,25,423,22,22,17,85,48,534};
		sortRecursion(array);
		for(int a : array){
			System.out.print(a+",");
		}
	}
	
	private static int[] sortRecursion(int[] array){
		split(array, 0, array.length-1);
		return array;
	}
	
	private static int[] sortLoop(int[] array){
		return array;
	}

	private static void split(int[] array,int p,int r){
		if (p < r) {
			int q = (p+r)/2;
			split(array, p, q);
			split(array, q+1, r);
			merge(array, p, q, r);
		}
	}
	
	private static int[] merge(int[] array,int p,int q,int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int[] array1 =  new int[n1+1];
		int[] array2 = new int[n2+1];
		for(int i=0;i<n1;i++){
			array1[i] = array[p+i];
		}
		array1[n1] = 9999;
		for(int i=0;i<n2;i++){
			array2[i] = array[q+i+1];
		}
		int i=0;
		int j=0;
		array2[n2] = 9999;
		for(int k=p;k<r+1;k++){
			if (array1[i]<=array2[j]) {
				array[k] = array1[i];
				i++;
			}
			else{
				array[k] = array2[j];
				j++;
			}
		}
		
		return array;
	}
}
