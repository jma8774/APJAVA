package array;

public class ArrayMethod {
	 public static void main(String[] args) {
 		int[] arr={2,3,4,6,9,11,12,15};
 		checkHalfway(arr,12,0,arr.length-1);
 		swap(arr,0,arr.length-1);
	 }

	private static void swap(int[] arr, int i, int j) {
 		int placeholder=arr[j];
 		arr[j]=arr[i];
 		arr[i]=placeholder;
     }

	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue<arr[(begin+end+1)/2];
	}
	private static void shuffle(int[] arr){
		for(int i=0;i<arr.length;i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}
	private static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
}
