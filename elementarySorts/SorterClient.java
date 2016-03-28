public class SorterClient{
    static void printArr(int[] arr){
	for(int i = 0; i < arr.length; i++)
	    System.out.println("arr["+i+"] = " +arr[i]);
    }


    public static void main(String[] args){
	int[] arr = new int[10];
	int cnt = 10;
	for(int i = 0; i < arr.length; i++){
	    arr[i] = cnt;
	    cnt--;
	}
	System.out.println("Array before sort");
	printArr(arr);
	//SelectionSort.sort(arr);
	//InsertionSort.sort(arr);
	ShellSort.sort(arr);
	System.out.println("Sorted array with Insertion sort");
	printArr(arr);
    }

}

