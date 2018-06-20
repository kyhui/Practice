import java.util.Arrays;

public class MergeSort {
	int[] arr;
	int[] temparr;
	public MergeSort(int[] input){
		this.arr = input;
		this.temparr = new int[arr.length];
		sort(0,arr.length-1);
	}
	/**
	 * separate all the elements
	 * @param left
	 * @param right
	 */
	private void sort(int left, int right){
		if(left<right){
			int middle = left + (right-left)/2;
			sort(left, middle);
			sort(middle+1, right);
			merge(left, middle, right);
		}
	}
	/**
	 * merge all the items from the left right and middle back together
	 * @param left
	 * @param middle
	 * @param right
	 */
	private void merge(int left, int middle, int right){
		for(int i = left; i <= right; i++){
			temparr[i] = arr[i];
		}
		int i = left;
		int j = middle+1;
		int k = left;
		while(i<=middle && j<= right){
			if(temparr[i]<=temparr[j]){
				arr[k++] = temparr[i++];
			}
			else{
				arr[k++] = temparr[j++];
			}
			//System.out.println(Arrays.toString(temparr));
			//System.out.println(Arrays.toString(arr)+'\n');
		}
		while(i<=middle){
			arr[k++] = temparr[i++];
		}
	}
}
