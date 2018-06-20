import java.util.Arrays;

public class Tester {
	public static void main(String a[]){
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		System.out.println(Arrays.toString(inputArr));
		//MergeSort ms = new MergeSort(inputArr);
		QuickSort qs = new QuickSort(inputArr);
		System.out.println(Arrays.toString(inputArr));
	}
}
