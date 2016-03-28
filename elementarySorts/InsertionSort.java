public class InsertionSort{

     public static void sort(int[] arr){
	for(int i=0; i < arr.length; i++){
	    for(int j=i; j > 0; j--){
		if(less(arr[j],arr[j-1])){
		    //swap
		    exch(arr,j,j-1);
		}
		else
		    break;
	    }
	}
    }

     public static boolean less(int a, int b){
	 return a < b;
     }

     public static void exch(int arr[], int i, int j){
	 int temp = arr[i];
	 arr[i] =arr[j];
	 arr[j] = temp;
     }



}