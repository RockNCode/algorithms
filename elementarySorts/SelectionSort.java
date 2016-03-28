public class SelectionSort{

     public static void sort(int[] arr){
	for(int i=0; i < arr.length; i++){
	    int min = arr[i];
	    int index =i;
	    for(int j=i+1; j < arr.length;j++){
		if(less(arr[i],arr[j])){
		    min = arr[j];
		    index =j;
		}
	    }
	    //swap goes here
	    exch(arr,i,index);
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