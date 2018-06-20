import java.util.Arrays;

public class QuickSort {
	int[] arr;
	public QuickSort(int[] input){
		this.arr = input;
		sort(0,arr.length-1);
	}
	
	private void sort(int left, int right){
		int i = left; int j = right;
		int pivot = arr[left+(right-left)/2];
		while(i<=j){
			while(arr[i]<pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<=j){
				swap(i, j);
				i++;
				j--;
			}
		}
		if(i<right) sort(i, right);
		if(left<j) sort(left, j);
	}
	
	private void swap(int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
