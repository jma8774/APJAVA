package sort;

import java.util.Arrays;

public class RecursionIntro {
	public static void main(String[] args) {
//		System.out.println("Using a for loop...");
//		for(int i=0;i<5;i++){
//			System.out.println("Hello everyone!");
//		}
//		System.out.println("Using recursion...");
//		int numberOfTimes=5;
//		forLoop(numberOfTimes,new Action() {
//			public void act() {
//				System.out.println("Hello everyone!");
//			}
//		});
		//hanoi(3,"A","B","C");
		int[] arr={2,5,1,4,7,3};
		mergeSort(arr);
	}
	public static void hanoi(int numberOfDiscs, String from, String mid, String to) {
		if(numberOfDiscs<=1){
			print("Move from "+from+" to "+to);
		}else{
			//move all but the last one to peg B
			hanoi(numberOfDiscs-1,from,to,mid);
			//move the last one to C
			hanoi(1,from,mid,to);
			//move all but he last one to C
			hanoi(numberOfDiscs-1,mid,from,to);
		}
	}
	private static int moveCount=1;
	private static void print(String string) {
		System.out.println("Move #"+moveCount+": "+string);
		moveCount++;
	}
	private static void forLoop(int numberOfTimes, Action action) {
		if(numberOfTimes<=1) {
			action.act();
		}else {
			action.act();
			forLoop(numberOfTimes-1,action);
		}
	}
	public static int[] mergeSort(int[] array){
		if(array.length ==1) return array;
		else{
			int[] first = new int[array.length/2];
			int[] second = new int[array.length - first.length];
			for(int i=0; i<first.length;i++){
				first[i]=array[i];
			}
			for(int j=0;j<second.length;j++){
				second[j]=array[j+first.length];
			}
			return merge(mergeSort(first),mergeSort(second));
		}
	}
	private static int[] merge(int[] a, int[] b){
		int[] array= new int[a.length + b.length];
		int i =0;
		int j =0;
		int z =0;
		while(i<a.length && j<b.length){//i<a.length && j<b.length
			if(a[i]<=b[j])
			{
				array[z]=a[i];
				i++;
			}
			else{
				array[z]=b[j];
				j++;
			}
			z++;
		}
		while(i<a.length){
			array[z]=a[i];
			i++;
			z++;
		}
		while(j<b.length){
			array[z]=b[j];
			j++;
			z++;
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
}
