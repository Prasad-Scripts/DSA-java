import java.util.Scanner;

class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Size of the array: ");
		int Size = scanner.nextInt();
		int[] array = new int[Size];
		
		System.out.print("Enter " + Size + " Elements: ");
		for(int i=0;i<Size;i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Before Sorting: ");
		for(int nums : array) {
			System.out.print(nums + " ");
		}
		
		int []arrays = BubbleSortMethod(array,Size);
		
		System.out.println();
		System.out.print("After Sorting: ");
		for(int nums : array) {
			System.out.print(nums + " ");
		}		
	}
	
	static int[] BubbleSortMethod(int[] array, int Size) {
		int i,j,temp;
		
		for(i=0;i<Size;i++) {
			for(j=0;j<Size - 1;j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
		
	}
}