public class ShellSort{

    public static void h_sort(int[] arr,int h){
	 for(int i=0; i < arr.length; i++){
	     for(int j=i; j > h-1; j--){
		 if(less(arr[j],arr[j-h])){
		     //swap
		     exch(arr,j,j-h);
		 }
		 else
		     break;
	     }
	 }

    }

    public static void sort(int arr[]){
	int N = arr.length;
	int h = 1;
	while( h < N/3 )
	    h = 3*h + 1; //find the upper limit;
	
	while(h >= 1){
	    h_sort(arr,h);
	    h = h/3;
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